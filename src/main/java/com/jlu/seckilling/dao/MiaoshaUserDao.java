package com.jlu.seckilling.dao;

import com.jlu.seckilling.domain.MiaoshaUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author QuJing
 * @create 2020/3/12
 */
public interface MiaoshaUserDao {
    @Select("select * from miaosha_user where id = #{id}")
    public MiaoshaUser getById(@Param("id")long id);
}
