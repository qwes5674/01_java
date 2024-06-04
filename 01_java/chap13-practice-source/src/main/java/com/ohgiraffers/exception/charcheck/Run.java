package com.ohgiraffers.exception.charcheck;

import java.io.IOException;
import java.util.Scanner;

public class Run {

    public void test1(){

        System.out.print("문자열을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        CharacterProcess  process = new CharacterProcess();
        process.countAlpha(str);

        try{
            if(str = null){}
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        System.out.println("공백 문자를 가질 수 없습니다.");
    }
}
