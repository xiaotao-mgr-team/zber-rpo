package com.zb.zber.common.core.persistence.db.dialect;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * <p>
 * mysql数据库方言
 * </p>
 * 
 * @author wub
 * @see Dialect
 *
 */
public class SqlServerDialect extends Dialect {
    @Override
    public String getLimitString(String sql, int offset, int limit) {
        sql = prepare(sql); // 准备sql
        StringBuffer sb = new StringBuffer(sql);
//        if (offset > 0) {
//            sb.append(" between ").append(offset).append(" and ").append(limit);
//        } else {
//            sb.append(" between ").append(limit);
//        }
        sb.append(" between ").append(offset).append(" and ").append(limit);
        return sb.toString();
    }

    @Override
    public String getLimitString(String sql, boolean hasOffset) {
        return new StringBuffer("select temp.* from (").append(prepare(sql)).
                append(")as temp where row_number").append(hasOffset ? " between ? and ? " : " between ? and ? ").toString();
    }

    @Override
    public void setLimitParamters(PreparedStatement ps, int parameterSize, int offset, int limit) throws SQLException {
        int index = 1;
        ps.setInt(parameterSize + index, offset + 1);
        index++;
        ps.setInt(parameterSize + index, offset + limit);
    }
    
    /**
     * 支持分页
     */
    @Override
    public boolean supportsLimit() {
        return true;
    }
}
