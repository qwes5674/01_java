package com.ohgiraffers.section_test2.problem3;

/*
* Tesla Model S를 만들고 2022년식이며 전기차인 자동차 객체를 생성하여 값을 출력하세요.
* */
public class Application3 {
    public static void main(String[] args) {

        Car car = new Car();

        car.setModel("Tesla Model S");
        car.setYear(2022);
        car.setType("전기차");

        System.out.println((car.getInfo()));

    }
}
