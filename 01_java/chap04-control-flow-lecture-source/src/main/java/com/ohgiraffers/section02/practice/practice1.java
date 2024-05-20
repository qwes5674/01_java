package com.ohgiraffers.section02.practice;

import java.util.Scanner;

public class practice1 {
    public void testStar1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++){

            for(int j=1; j<= i; j++){
                System.out.print("*");
            }
            //별 찍고 줄바꾸기
            System.out.println();
        }
   }
}
