package com.jlu.seckilling.utils.redis;

/**
 * @author QuJing
 * @create 2020/3/3
 */
public class UserKey extends BasePrefix{

    private UserKey(String prefix) {
        super(prefix);
    }
    public static UserKey getById = new UserKey("id");
    public static UserKey getByName = new UserKey("name");
}
