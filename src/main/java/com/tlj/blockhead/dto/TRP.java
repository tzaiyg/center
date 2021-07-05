package com.tlj.blockhead.dto;

import com.tlj.blockhead.Utils.EnumT;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class TRP<T> {
    public TRP(T data) {
        this.code = EnumT.SUCCESS.getCode();
        this.message = EnumT.SUCCESS.getMessage();
        this.data = data;
    }
    public TRP(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public TRP(String code, String message, T data, Date returnTime) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.returnTime = returnTime;
    }

    String code;
    String message;
    T data;
    Date returnTime;

}
