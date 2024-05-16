package com.ohgiraffers.section01.method;

public class Calculator {


    // 삼항연산자로 두 수를 비교해서 작은 값을 return 해주는 매서드
    public int nonStaticMinNumberOf(int first, int second){

       // int result = (first > second)? second: first;

       return (first > second) ? second : first;
  }

    // 삼황연산자로 두 수를 비교해서 큰 값을 return 해주는 메서드
    public static int staticMaxNumberOf(int first, int second){

        return(first > second) ? first: second; //큰 값
    }

    //더하기,뺴기,곱하기, 나누기 , 나머지
    // 이 각각을 숭행할 수 있는 메서드를 만들고
    //더하기, 빼기, 곱하기, 나누기 non-static
    //나머지 static

    public static int nonStaticPlusNumberOf(int first, int second){

        return(first + second);
    }

    public static int nonStaticMinusNumberOf(int first, int second){

        return(first - second);
    }

    public static int nonStaticMultipleNumberOf(int first, int second){

        return(first * second);
    }

    public static int nonStaticDevideNumberOf(int first, int second){

        return(first / second);
    }

    public static int StaticRestNumberOf(int first, int second){

        return(first % second);
    }
}
