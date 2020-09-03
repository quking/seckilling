package com.jlu.seckilling.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author QuJing
 * @create 2020/3/12
 */
@Data
public class MiaoshaUser {
    private Long id;
    private String nickname;
    private String password;
    private String salt;
    private String head;
    private Date registerDate;
    private Date lastLoginDate;
    private Integer loginCount;
}
