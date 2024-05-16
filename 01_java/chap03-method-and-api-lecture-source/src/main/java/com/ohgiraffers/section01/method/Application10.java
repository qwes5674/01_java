package com.ohgiraffers.section01.method;

public class Application10 {
    public static void main(String[] args) {

        int num1 = 16;
        int num2 = 5;

        Calculator calc = new Calculator();

        /* Calcultator Calss에
           더하기, 뺴기, 곱하기, 나누기, 나머지
           이 각각을 수행할 수 있는 메서드를 만들고
           Application10의 main 메서드에 출력하라

           (더하기, 뺴기, 곱하기, 나누기 => non-static
            나머지 => static)
           */


        //더하기
        int plus = calc.nonStaticPlusNumberOf(num1,num2);
        System.out.println("두 수의 합 : " + plus);

        //뺴기
        int minus = calc.nonStaticMinusNumberOf(num1,num2);
        System.out.println("두 수의 차 : " + minus);

        //곱하기
        int multiple = calc.nonStaticMultipleNumberOf(num1,num2);
        System.out.println("두 수의 곱 : " + multiple);

        //나누기
        int dive = calc.nonStaticDevideNumberOf(num1,num2);
        System.out.println("두 수의 나누기 : " + dive);

        //나머지
        int rest = Calculator.StaticRestNumberOf(num1,num2);
        System.out.println("두 수의 나머지 : " + rest);
    }
}
