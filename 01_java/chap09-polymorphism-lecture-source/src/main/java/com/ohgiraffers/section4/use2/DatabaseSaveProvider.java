package com.ohgiraffers.section4.use2;

public class DatabaseSaveProvider implements SaveProvider{

    @Override
    public boolean save(String data) {

        System.out.println("["+data+"] 내용을 " + "Database에 저장 성공했습니다.");
        return true;
    }
}
