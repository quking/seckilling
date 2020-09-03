package com.jlu.seckilling.utils.redis;

/**
 * @author QuJing
 * @create 2020/3/3
 */
public interface KeyPrefix {

    public int expireSeconds();

    public String getPrefix();

}
