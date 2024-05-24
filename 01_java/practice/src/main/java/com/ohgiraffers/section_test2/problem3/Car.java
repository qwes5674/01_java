package com.ohgiraffers.section_test2.problem3;

public class Car {

private String model;
private int year;
private String type;

public void setModel(String model){
    this.model = model;
}

public void setYear(int year){

    this.year = year;
}

public void setType(String type) {
    this.type = type;
}

public String getInfo(){
    return "자동차의 모델은 " + this.model + "이고, 자동차 연식은 " + this.year
            + "이고, 자동차 타입은 " + this.type + "이다.";
}

}
