package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal{

    @Override
    public void eat() {
        System.out.println("토끼가 풀을 먹고 있습니다. ");
    }

    @Override
    public void run() {
        System.out.println("ㅌ끼가 달려가고 있습니다");
    }

    @Override
    public void cry() {
        System.out.println("토기가 울음소리를 냅니다. 끼익 ~ 끼익~ ");
    }

    //토끼는 점프가능
    public void jump(){
        System.out.println("토끼가 점프합니다. 점프~!!!!");
    }
}
