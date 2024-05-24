package com.ohgiraffers.section_test2.problem1;

public class Dog {
    private String name;
    private String species;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){

        if(age >0){
            this.age = age;
        }else{
            this.age = Math.abs(age);
        }
    }

    public void setSpecies(String species){
        this.species = species;
    }

    public String getInfo () {
        return "강아지의 이름은 " + this.name + "이고, 나이는 " + this.age +
                "이며 종은 " + this.species + "입니다.";
    }
}
