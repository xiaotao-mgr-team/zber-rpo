package com.zb.zber.common.core.persistence.db.dao.mybatis;

import com.zb.zber.common.core.context.mybatis.MybatisUtils;
import com.zb.zber.common.core.context.mybatis.batch.Batch;
import com.zb.zber.common.core.context.mybatis.batch.PreparedBatch;
import com.zb.zber.common.core.persistence.db.util.JdbcUtils;
import org.apache.ibatis.logging.jdbc.ConnectionLogger;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.SqlSessionUtils;
import org.springframework.util.Assert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/** 
 * <p>
 * Mybatis Base Super Dao<br/>
 * dependency: mybatis, mybatis-spring
 * </p>
 *  
 * @author wub
 *
 */
public class DaoSupport extends org.springframework.dao.support.DaoSupport {
	private SqlSession sqlSession;

	private boolean externalSqlSession;

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		if (!this.externalSqlSession) {
			this.sqlSession = new SqlSessionTemplate(sqlSessionFactory);
		}
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSession = sqlSessionTemplate;
		this.externalSqlSession = true;
	}

	public SqlSession getSession() {
		return this.sqlSession;
	}
	
	/**
	 * 获取select的总数量<br/>
	 * 采用select count(*)<br/>
	 * 参考{@link DaoSupport#selectCount(SqlSession, String, Object)}
	 * 
	 * @param statement
	 * @param parameter
	 * @return
	 * @throws SQLException 
	 */
	public long selectCount(String statement, Object parameter) throws SQLException {
		return selectCount(this.getSession(), statement, parameter);
	}
	
	/**
	 * 获取select的总数量<br/>
	 * 采用select count(*)
	 * 
	 * @param sqlSession
	 * @param statement
	 * @param parameter
	 * @return
	 * @throws SQLException 
	 */
	public long selectCount(SqlSession sqlSession, String statement, Object parameter) throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		SqlSession ss = null;
		SqlSessionFactory sf = null;
		try {
			long count = 0L;
			MappedStatement mst = sqlSession.getConfiguration().getMappedStatement(statement);
			BoundSql boundSql = mst.getBoundSql(parameter); // PreparedStatement sql
			String sql = "select count(*) total_count from (" + boundSql.getSql()+ ") tb";
			
			//Connection conn = sqlSession.getConnection(); // bug get closed connection
			SqlSessionTemplate st = (SqlSessionTemplate) sqlSession;
			sf = st.getSqlSessionFactory();
			ss = SqlSessionUtils.getSqlSession(sf, st.getExecutorType(), st.getPersistenceExceptionTranslator());
			Connection conn = ss.getConnection();
			
			if (MybatisUtils.PREPAREDSTATEMENT_LOG.isDebugEnabled() || MybatisUtils.CONNECTION_LOG.isDebugEnabled()) { // log proxy
				conn =  ConnectionLogger.newInstance(conn, MybatisUtils.PREPAREDSTATEMENT_LOG);
			}
			stmt = conn.prepareStatement(sql);
			MybatisUtils.setParameters(stmt, mst, boundSql, parameter);
			rs=stmt.executeQuery();
			if (rs.next()){
				count = rs.getLong("total_count");
			}
			return count;
		} finally {
			JdbcUtils.closeResultSet(rs);
			JdbcUtils.closeStatement(stmt);
			if (null != ss && null != sf) {
				SqlSessionUtils.closeSqlSession(ss, sf);
			}
		}
	}
	
	/**
	 * 开始Statement Batch
	 * 
	 * @return
	 * @throws SQLException
	 */
	public Batch startBatch() throws SQLException {
		return new Batch(this.getSession());
	}
	
	/**
	 * 开始PreparedStatement Batch
	 * 
	 * @param statement map id
	 * @param parameter
	 * @return
	 * @throws SQLException
	 */
	public PreparedBatch startPreparedBatch(String statement, Object parameter) throws SQLException {
		return new PreparedBatch(this.getSession(), statement, parameter);
	}
	
	/**
	 * {@inheritDoc}
	 */
	protected void checkDaoConfig() {
		Assert.notNull(this.sqlSession, "Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required");
	}
}
