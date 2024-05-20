package com.ohgiraffers.section02.looping;

//실행용 클래스
public class Application {
    public static void main(String[] args) {

        A_for a_for = new A_for();

        // a_for.testSimpleForStatement();
        //a_for.testForexample1();
        //a_for.testForexample2();
        //a_for.testForexample3();
        //a_for.printSimpleGugudan();
        //a_for.testExample4();

        A_nestedFor a_nestedFor = new A_nestedFor();
        //a_nestedFor.printGugudanFromTwoToNine();
        //a_nestedFor.printStarInputRowTimes();
        a_nestedFor.printTriangleStars();
    }

}
