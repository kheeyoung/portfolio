package com.portfolio.portfolio;

import java.time.LocalDateTime;

public class PublicMethod {
    public String getNowTime(){
        String nowTime = LocalDateTime.now().getYear()+"년 "+
                LocalDateTime.now().getMonthValue()+"월 "+
                LocalDateTime.now().getDayOfMonth()+"일 "+
                LocalDateTime.now().getHour()+":"+
                LocalDateTime.now().getMinute();
        return nowTime;
    }
}
