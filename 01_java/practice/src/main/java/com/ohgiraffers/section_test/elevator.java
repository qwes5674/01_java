package com.ohgiraffers.section_test;

import java.util.Scanner;

public class elevator {

    /*
    * 1층에서 7층까지 자신이 원하는 층에 올라갈려고 한다.
    * */
   public void testElevator(){
       Scanner sc = new Scanner(System.in);
       System.out.println("원하는 층을 눌러주세요(1-7)");
       int floor = sc.nextInt();

       switch(floor){
           case 1:
               System.out.println("1층 입니다. 문이 열립니다");
                break;
           case 2:
               System.out.println("2층 입니다. 문이 열립니다.");
               break;
           case 3:
               System.out.println("3층 입니다. 문이 열립니다.");
               break;
           case 4:
               System.out.println("4층 입니다. 문이 열립니다.");
               break;
           case 5:
               System.out.println("5층 입니다. 문이 열립니다.");
               break;
           case 6:
               System.out.println("6층 입니다. 문이 열립니다");
               break;
           case 7:
               System.out.println("7층 입니다. 문이 열립니다");
               break;
           default:
               System.out.println("다시 눌러주시기 바랍니다.");
       }
       System.out.println("문이 닫힙니다.");
   }
}
