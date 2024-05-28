package com.ohgiraffers.section4.use1;

//car 상속받아서
public class RacingCar extends Car {

    // start() " 레이싱카가 달려갑니다"
    @Override
    public void go() {
        System.out.println("레이싱카가 달려갑니다");
    }

    // stop () "레이싱카가 멈춥니다"
    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다");
    }
}
