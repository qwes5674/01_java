package com.ohgiraffers.section2.package_and_import;

public class Application1 {


    public static void main(String[] args) {
        /*
         * 패키지
         *
         * 서로 관련 있는 클래스 또는 인터페이스 등을 모아 하나의 묶음으로 단위를 구성하는 것을 의미
         * 같은 패키지 내에 동일한 이름의 클래스를 만들 수 없다.
         * 패키지가 다르면 동일한 이름의 클래스를 만들 수 있다.
         * => 클래스명은 원래 패키지 명을 포함하고 있기 때문
         * com.ohgiraffers.section01.method.Calculartor
         * com.ohgiraffers.setion02.menthod.calculrator
         * com.ohgiraffers.section02.package_and_import.import.Application
         *
         * */

        com.ohgiraffers.section01.method.Calculator calc = new com.ohgiraffers.section01.method.Calculator();
        int min = calc.nonStaticMinNumberOf(30,20);

        System.out.println("다른 패키지에서 메소드 호출(최소값) ; " + min);

        //static 메서드
        int max = com.ohgiraffers.section01.method.Calculator.staticMaxNumberOf(30,20);
        System.out.println("다른 패키지에서 메소드 호출 (최대값)" + max);
    }

}
