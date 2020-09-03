package com.jlu.seckilling.controller;

/**
 * @author QuJing
 * @create 2019/12/4
 */
//@RestController
//public class UserController {
//
//    @Autowired
//    private UsersDao usersDao;
//
//    @Autowired
//    private RedisTemplate<Object,Object> rediss;
//
//    @GetMapping("/user/{id}")
//    public Users findUser(@PathVariable("id") Integer id){
//        RedisSerializer redisSerializer = new StringRedisSerializer();
//        rediss.setKeySerializer(redisSerializer);
//        Users u = (Users) rediss.opsForValue().get("key");
//        if(null == u){
//            synchronized (this){           //处理缓存穿透问题
//                if(u == null) {
//                    u = usersDao.UserfindById(id);
//                    rediss.opsForValue().set("key",u);
//                }
//            }
//        }
//        return u;
//    }
//}
