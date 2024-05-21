package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

        /*
        * 5명의 자바 점수를 정수로 입력받아서, 합계와 평균을 실수로 구하는 프로그램
        * */

        int[] scores = new int[5];

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double avg = 0;


        for(int i=0;i<scores.length;i++){
            //점수를 입력받는다.
            System.out.println( (i+1) + " 번째 학생의 점수를 입력해주세요 : ");
            scores[i]=sc.nextInt();

            sum = sum + scores[i];
            avg = (double) sum/scores.length;
        }
            System.out.println("5명의 자바 점수의 합 : " + sum);
            System.out.println("5명의 자바 점수의 평균 : " + avg);

        //입력받은 점수를 score 배열로 저장
        //배열의 값들을 합계 -> int
        //배열에 값들의 평균 -> double

    }
}
