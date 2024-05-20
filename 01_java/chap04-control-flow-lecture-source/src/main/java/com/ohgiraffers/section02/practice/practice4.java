package com.ohgiraffers.section02.practice;

public class practice4 {
    public void testStar4() {
        for (int i = 0; i<=8; i+=2 ) {
            for(int j =8; j> i; j-=2){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}