package com.jlu.seckilling.vo;

import com.jlu.seckilling.validator.IsMobile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * @author QuJing
 * @create 2020/3/3
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginVo {

    @NotNull
    @IsMobile
    private String mobile;

    @NotNull
    @Length(min = 32)
    private String password;
}
