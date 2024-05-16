package com.ohgiraffers.section01.method;

public class Application4 {

    public static void main(String[] args) {
      /* 여러개의 전달인자를 이용한 메소드의 호출 테스트 */
      Application4 app4 = new Application4();
      app4.testMethod("박효찬",20,'남');
      // 지역변수는 메서드 안에서만 고유값을 갖기 때문에 변수명이 같을 수 있다.
      String name= "박효찬";
      int age = 20;
      char gender = '남';

      app4.testMethod(name,age,gender);

    }

    // "당신의 이름은 ~이고, 나이는 ~이고, 성별은 ~입니다.
    // 지역변수 앞에 final을 넣어서 값을 고정시킨다.
    public void testMethod(String name, int age, final char gender){

        System.out.println(" 당신의 이름은 : " + name +" 당신의 나이는 : " + age +" 당신의 성별은 : " + gender + "입니다.");

    }
}
