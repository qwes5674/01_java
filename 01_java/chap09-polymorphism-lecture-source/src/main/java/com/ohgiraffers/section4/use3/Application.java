package com.ohgiraffers.section4.use3;

public class Application  {

    public static void main(String[] args) {


        Dice dice = new SuperDice(); //SuperDice로 변경해도 작동되게

        Dicer dicer = new Dicer();

        dicer.throwDice(dice);
    }
}
