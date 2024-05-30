package com.ohgiraffers.section4.use3;

public class SuperDice implements Dice{

    int min;
    int max;

    public SuperDice(){
        this.max =10;
        this.min = 1;
    }

    @Override
    public int getNumber() {
        return (int) (Math.random() * (max - min +1)+min);
        // 랜덤숫자 최대 최소 구하기 (Math.random() * (max - min + 1) + min)
        // 1~10 => int num = (int)(Math.random() * 10) + 1

    }
}
