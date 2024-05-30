package com.ohgiraffers.section3.stringbulider;

public class Application2 {
    //StringBuilder의 자주 사용되는 메서드
    public static void main(String[] args) {

        /*
        * delete () : 시작 인덱스와 종료 인덱스를 이용해서 문자열에서 원하는 부분의 문자열 제거
        * deleteCarAt() : 문자열 인덱스를 이용해서 문자 하나를 제거
        * => 둘다 원본에 영향을 미친다.
        * */

        StringBuilder sb = new StringBuilder("javaOracle");
        StringBuilder sb2 = new StringBuilder("javaOracle");

        System.out.println("sb = " + sb);

        System.out.println("delete() : " + sb.delete(2,5));

        System.out.println("sb = " + sb);

        System.out.println("sb2 = " + sb2);

        System.out.println("delete() : " + sb.deleteCharAt(2));


    }

}
