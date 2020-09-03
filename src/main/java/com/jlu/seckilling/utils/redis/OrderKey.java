package com.jlu.seckilling.utils.redis;

/**
 * @author QuJing
 * @create 2020/3/3
 */
public class OrderKey extends BasePrefix {

    public OrderKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

}
