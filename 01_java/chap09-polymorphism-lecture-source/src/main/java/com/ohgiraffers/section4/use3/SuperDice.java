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
    }
}
