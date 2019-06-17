package com.wgs.dao;

import com.wgs.domain.Intord;
import com.wgs.domain.IntordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntordMapper {
    long countByExample(IntordExample example);

    int deleteByExample(IntordExample example);

    int deleteByPrimaryKey(String id);

    int insert(Intord record);

    int insertSelective(Intord record);

    List<Intord> selectByExample(IntordExample example);

    Intord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Intord record, @Param("example") IntordExample example);

    int updateByExample(@Param("record") Intord record, @Param("example") IntordExample example);

    int updateByPrimaryKeySelective(Intord record);

    int updateByPrimaryKey(Intord record);
}