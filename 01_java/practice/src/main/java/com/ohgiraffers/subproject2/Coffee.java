package com.ohgiraffers.subproject2;

public class Coffee {

    //커피 종류
    private final String coffeeName;

    //옵션
    private final String option;

    public Coffee(String coffeeName, String option){
        this.coffeeName = coffeeName;
        this.option = option;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public String getOption() {
        return option;
    }

    public String toString(){
        return "%s(%s)".formatted(coffeeName,option);
    }
}
