package com.ohgiraffers.section2.assignment;

public class Application1 {
    public static void main(String[] args) {

        /*
       * 대입 연산자와 산술 복합 대입 연산자
       * '=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입함
       * '+=' : 왼쪽의 피연산에 오른쪽의 피연산를 더한 결과를 왼쪽의 피연산자에 대입함
       * '-=' : 왼쪽의 피연산에 오른쪽의 피연산를 뻰 결과를 왼쪽의 피연산자에 대입함
       * '*=' : 왼쪽의 피연산에 오른쪽의 피연산를 곱한 결과를 왼쪽의 피연산자에 대입함
       * '/=' : 왼쪽의 피연산에 오른쪽의 피연산를 나눈 결과를 왼쪽의 피연산자에 대입함
       * '%=' : 왼쪽의 피연산에 오른쪽의 피연산를 나눈 나머지 결과를 왼쪽의 피연산자에 대입함
       * */

        int num = 10;
        int num2 = 10;

        num += 3; // num = num + 3
        System.out.println(num);

        num2 = num2 + 3;
        System.out.println(num2);

        num -= 5; // num = num -5;
        System.out.println("num = " +num);

        num *= 2; // num = num * 2;
        System.out.println("num = " + num);

        num /= 2; // num = num /2;
        System.out.println("num = " + num);

        num %= 3; // num = num % 3;
        System.out.println("num = " + num);

        /* 주의 사항: 산술 복합 대입연산자의 작성 순서의 주의해야 한다. */

        //num -= 1;
        num =- 1;
        System.out.println("num = " + num);
    }
}
