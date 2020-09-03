package com.jlu.seckilling.controller;

import com.jlu.seckilling.utils.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author QuJing
 * @create 2020/3/3
 */
@Controller
public class SampleController {

    @Autowired
    RedisService redisService;


}
