package com.tlj.blockhead.Utils;

import com.alibaba.fastjson.JSON;
import com.tlj.blockhead.dto.TRP;


import java.text.ParseException;

public class TrpTool {
    public static TRP<?> success(String msg, String code, Object data) throws ParseException {
        return TRP.builder().returnTime(DateUtil.getNowDate()).message(msg).code(code).data(JSON.toJSONString(data)).build();
    }

    public static TRP<?> error(String msg, String code, Object data) throws ParseException {
        return TRP.builder().returnTime(DateUtil.getNowDate()).message(msg).code(code).data(JSON.toJSONString(data)).build();
    }
}
