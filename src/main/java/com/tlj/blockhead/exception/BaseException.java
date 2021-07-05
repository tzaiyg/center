package com.tlj.blockhead.exception;

import lombok.Data;

/**
 * @author ：tlj
 * @date ：Created in 2021/7/1 11:11
 * @version: IntelliJ IDEA
 */
@Data
public class BaseException extends RuntimeException {

    public BaseException() {
    }

    public BaseException(String message, String code) {
        this.code = code;
        this.message = message;
    }

    String code;
    String message;

}
