package com.ohgiraffers.section02.practice;

import java.util.Scanner;

public class practice2 {

    public void teststar2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요.");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int j = row; j >= i; j--) {
                System.out.print("*");
            }
            //별 찍고 줄바꾸기
            System.out.println();
        }
    }
}
