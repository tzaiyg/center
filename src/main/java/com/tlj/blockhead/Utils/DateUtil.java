package com.tlj.blockhead.Utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtil {

    public static Date getNowDate() throws ParseException {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = localDateTime.format(dtf);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        /*
         * 将给定的字符串按照SimpleDateFormat指定的日期格式解析并转换为Date对象返回
         */
        Date date = sdf.parse(format);

        return date;
    }

    public static void main(String[] args) throws ParseException {
        final Date nowDate = getNowDate();
        final StringBuffer stringBuffer = new StringBuffer();
        System.out.println(nowDate.toString());
        for (char a : nowDate.toString().toCharArray()) {
            if (a >= '0' && a <= '9') {
                stringBuffer.append(a);
            }
        }
        int length = stringBuffer.toString().length();
        final char[] chars = stringBuffer.toString().toCharArray();
        String k = "";
        for (int i = length; length > 0; length--) {
            final char aChar = chars[length - 1];
            k = k + aChar;
        }
        System.out.println(k);
    }
}
