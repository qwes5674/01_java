package com.ohgiraffers.section_test;

public class Rectangle {

    public static void main(String[] args) {

        Rectangle rc = new Rectangle();

       double width = 3.82;
       double length = 8.65;

        System.out.println("면적:" + rc.getArea(width,length));
        System.out.println("둘레:" + rc.getCircumference(width,length));
    }



    public double getArea(double width, double length){
        return width * length;
    }

    public double getCircumference(double width, double length){
        return 2 * (width + length);
    }
}
