package com.tlj.blockhead.exception;

import com.tlj.blockhead.dto.TRP;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：tlj
 * @date ：Created in 2021/7/1 11:27
 * @version: IntelliJ IDEA
 */
@ControllerAdvice
@Slf4j
public class Catchexceptions {

    @ResponseBody
    @ExceptionHandler({BaseException.class})
    public TRP globalException(BaseException ex) {
        String exMessage = ex.getMessage();
        String errorCode = ex.getCode();
        return TRP.builder().code(errorCode).message(exMessage).build();
    }
}
