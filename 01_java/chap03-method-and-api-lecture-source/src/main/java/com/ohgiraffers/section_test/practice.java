package com.ohgiraffers.section_test;

public class practice {

    //1. 자기 소개문 작성 (나이, 이름, 성별,거주지, 생년월일)

    public static void main(String[] args) {
      practice pt =new practice();

      String name = "박효찬";
      int age =26;
      char gender = '남';
      String address = "경기도 광명시 ...";
      pt.testMethod(name,age,gender,address);
    }

    public void testMethod(String name, int age, final char gender, String address){
        System.out.println("이름은 : " + name +","+ " 나이는 : " + age+ "," + " 성별은: "+ gender +","+ " 거주지는: " + address );
    }
}
