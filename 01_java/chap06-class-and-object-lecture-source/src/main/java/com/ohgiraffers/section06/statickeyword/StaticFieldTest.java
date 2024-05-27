package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {

    private  int nonStaticCount;
    private static int StaticCount;

    //기본생성자
    public StaticFieldTest(){

    }

    public int getNonStaticCount(){
        return nonStaticCount;
    }

    public static int getStaticCount(){


        return StaticFieldTest.StaticCount;
    }

    // 두 개의 필드 값을 1씩 증가시키기 위한 메소드
    public void increaseNonStaticCount(){
        this.nonStaticCount++;
    }

    public void increaseStaticCount(){
        StaticFieldTest.StaticCount++;
    }
}
