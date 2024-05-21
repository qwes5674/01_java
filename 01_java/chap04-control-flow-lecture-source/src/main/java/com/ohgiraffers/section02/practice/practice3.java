package com.ohgiraffers.section02.practice;

public class practice3 {

    public void testStar3(){

        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j >0; j--) {
                if(i<j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }

            //별 찍고 줄바꾸기
            System.out.println("");
        }
    }
}
