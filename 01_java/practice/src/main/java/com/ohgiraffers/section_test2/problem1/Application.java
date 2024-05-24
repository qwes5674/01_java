package com.ohgiraffers.section_test2.problem1;

 /*
 * **문제 설명:**

  이름이 Max이고 5살이며 골든 리트리버 종인 강아지를 표현하는 클래스를 만들고,
  객체를 생성하여 값을 출력하세요.

 * */


public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setName("Max");
        dog.setAge(5);
        dog.setSpecies("골든 리트리버");

        System.out.println((dog.getInfo()));
    }
}
