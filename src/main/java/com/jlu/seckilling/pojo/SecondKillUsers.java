package com.jlu.seckilling.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author QuJing
 * @create 2019/12/4
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecondKillUsers implements Serializable {

    private Long id;
    private String nickname;
    private String password;
    private String salt;
    private String head;
    private Date registerDate;
    private Date lastLoginDate;
    private Integer loginCount;
}
