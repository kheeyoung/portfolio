package com.portfolio.portfolio;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;


@Component
public class PublicMethod {
    private final DB db;

    public PublicMethod(DB db) {
        this.db = db;
    }
    public String getNowTime(){
        String nowTime = LocalDateTime.now().getYear()+"년 "+
                LocalDateTime.now().getMonthValue()+"월 "+
                LocalDateTime.now().getDayOfMonth()+"일 "+
                LocalDateTime.now().getHour()+":"+
                LocalDateTime.now().getMinute();
        return nowTime;
    }

    public String getHeaderImg(){
        try {
            return db.getHeaderImg();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getProfileImg() {
        try {
            return db.getProfileImg();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
