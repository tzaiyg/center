package com.tlj.blockhead.exception;

import com.tlj.blockhead.Utils.EnumT;
import org.apache.logging.log4j.message.Message;

/**
 * @author ：tlj
 * @date ：Created in 2021/7/1 13:33
 * @version: IntelliJ IDEA
 */
public class ValidationException extends BaseException{
    private static EnumT enumT;
    public ValidationException(String message, String code) {
        super(message, code);
    }
//    }
//    public ValidationException(EnumT enumT){
//        this.enumT;
//        this
//    }
}
