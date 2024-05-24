package com.ohgiraffers.section_test2.problem4;

public class Human {

    private String name ;
    private int age;
    private char gender;
    private String marry;
    private int children;

    public void setName (String name){
        this.name = name;
    }

    public void setAge (int age){
        this.age = age;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public void setMarry(String marry){
        this.marry = marry;

    }


    public void setChildren(int children){
        this.children = children;
    }

    public String getInfo(){
        return "나이는 " +this.age +"이고 이름이 " +this.name + "인 " +this.gender+ "자가 있습니다."
                + this.marry + "했고 자식은 " + this.children + "명 있습니다.";
    }
}
