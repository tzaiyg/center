package com.tlj.blockhead.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class TRP<T> {
    String code;
    String message;
    T data;
    Date returnTime;

}
