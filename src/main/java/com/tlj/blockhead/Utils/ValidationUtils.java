package com.tlj.blockhead.Utils;

import com.tlj.blockhead.dto.TRP;
import com.tlj.blockhead.exception.BaseException;
import com.tlj.blockhead.exception.ValidationException;

import javax.swing.*;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import java.util.Set;

/**
 * @author ：tlj
 * @date ：Created in 2021/7/1 11:04
 * @version: IntelliJ IDEA
 */
public class ValidationUtils {
    private static Validator validator;
    static {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }
    public static  <T> void  validator(T t) {
        if(t!=null){
            Set<ConstraintViolation<T>> validate = validator.validate(t);
//        StringBuffer stringBuffer=new StringBuffer();
            if (validate != null){
                validate.forEach(x -> {
//                stringBuffer.append(x.getMessage());
                    throw new ValidationException(x.getMessage(),EnumT.NULL.getCode());
                });
            }
        }
    }
}
