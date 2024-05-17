package com.ohgiraffers.section01.conditonal;

public class Application {
    //실행용 클래스
    public static void main(String[] args) {

        A_If aif = new A_If();

       // aif.testSimpleIfStatement(); // 단일 if문
       // aif.testNestedIfStatement(); // 중첩 if문

        B_IfElse bIfElse = new B_IfElse();

        //bIfElse.testSimpleIfElseStatement(); // 단일 if-else문
        //bIfElse.testSimpleIfElseStatement(); // 중첩 if-else문

        C_IfElseIf cIfElseIf = new C_IfElseIf();

       // cIfElseIf.testSimpleIfElseIfStatement();
       // cIfElseIf.testIfElseIfStatement();

        D_switch dSwitch = new D_switch();

        //dSwitch.testSimpleSwitchStatment();
        //dSwitch.testSwitchVendIngMachine();
        dSwitch.testSwitch();
    }
}