package com.ohgiraffers.section01.method;

public class Application3 {

    public static void main(String[] args) {

        int num = 0;


        /*
        * 전달인자와 메개변수를 이용한 메소드 호출
        *
        * 변수의 종류
        *   1. 지역변수
        *   2. 메개변수
        *   3. 전역변수(필드)
        *   4. 클래스(static) 변수
        * */

        /*
        * 지역변수
        *
        * 지역변수는 선언한 메소드 블럭(영역) 내부에서만 사용 가능하다.
        * 다른 메소드간 서로 공유해야하는 값이 존재할 경우, 메소드 호출시 사용하는 괄호를 이용해서 값을 전달 할 수 있다.
        * 이 때, 전달되는 값을 전달인자라고 부르고
        * 메소드 선언부 괄호 안에 전달인자를 받기 위해 선언하는 변수를 메개변수 라고 부른다.
        * */

        Application3 app3 = new Application3();
        app3.testMethod(30);

        // app3.testMethod("20"); // 자료형이 틀림(int age로 정했지면 문자열로 선언해서 오류 발생)
        // app3.testMethod(20,30,40); // 개수가 틀림 (1개로)
        // app3.testMethod(); // 공백

        // 전달인자와 메개변수를 이용한 메소드 호출 테스트

        // 변수에 값을 저장해서 전달 할 수 있다.
        int age = 15;
        // String str = "15";
        app3.testMethod(age); //int type만 가능

        //자동형변환을 이용해 값 전달이 가능하다.
        byte byteAge = 10;
        app3.testMethod(byteAge);//자동형변환

        long longAge = 5;
        app3.testMethod((int)longAge); //강제형변환 , 앞에 괄호로 타입지정

        app3.testMethod(age + 3); //15+3
    }

    // 나이를 받아와서 "당신의 나이는 ~세 입니다." 출력하는 메서드 (전달인자 20이 넘어와 값을 할당함)
    public void testMethod(int age){

        System.out.println("당신의 나이는 : " + age + " 세 입니다.");
    }


}
