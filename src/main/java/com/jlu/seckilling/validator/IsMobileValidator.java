package com.jlu.seckilling.validator;

import com.jlu.seckilling.utils.ValidatorUtil;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author QuJing
 * @create 2020/3/3
 */
public class IsMobileValidator implements ConstraintValidator<IsMobile, String> {

    private boolean required = false;

    public void initialize(IsMobile constraintAnnotation) {
        required = constraintAnnotation.required();
    }

    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(required) {
            return ValidatorUtil.isMobile(value);
        }else {
            if(StringUtils.isEmpty(value)) {
                return true;
            }else {
                return ValidatorUtil.isMobile(value);
            }
        }
    }

}
