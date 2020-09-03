package com.jlu.seckilling.dao;

import com.jlu.seckilling.pojo.SecondKillUsers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author QuJing
 * @create 2020/3/3
 */
@Mapper
public interface SecondKillDao {

    @Select("select * from miaosha_user where id = #{id}")
    public SecondKillUsers getById(@Param("id")long id);
}
