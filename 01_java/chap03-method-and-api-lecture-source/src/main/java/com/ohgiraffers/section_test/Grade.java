package com.ohgiraffers.section_test;

public class Grade {
    public static void main(String[] args) {

        int korea = 95;
        int math =  75;
        int science = 80;

        System.out.println("평균은: " + avg (korea,math,science));
    }

    public static int avg(int korea,int math ,int science){
        return (korea + math + science) / 3 ;
    }

}
