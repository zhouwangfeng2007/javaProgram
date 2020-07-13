package com.zhouwf.DateAndCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        long ts = date.getTime();
        System.out.println(ts);

        Date dt3 = new Date(1594386992043L);
        System.out.println(dt3);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = sdf.format(date);
        System.out.println(str);
    }
}
