package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {

    /*
    * [while문 표현식]
    *
    * [초기식]
    *
    * while([조건식]){
    *    조건을 만족하는 경우 수행할 구문(반복될 코드)
    *    [증감식]
    *
    * }
    *
    * */

    public void testSimpleWhileStatment() {
        // 1부터 10까지 1씩 증가시키면서 i값을 출력하는 기본 반복문

        int i = 1;

        while (i <= 10) {
            System.out.println(i);

            i = i + 1;

            //10부터 1씩 감소시키면서 i값을 출력하는 반복문 작성하기

            int j = 10;

            while (j > 1) {
                System.out.println(j);
                j = j - 1;

            }
        }
    }
            public void testWhileExample1(){
                //입력한 문자열의 인덱스를 이이용해서 문자 하나씩 출력해보기
                /*
                * charAt(): 문자열에서 인덱스에 해당하는 문자를 char형으로 반환하는 기능
                * length( ) : 문자열에서 인덱스에 해당하는 문자를 char형으로 변환하는 기술
                *
                * index: 0부터 시작하고, 마지막 인덱스는 항상 길이보다 함께 숫자를 가진다.
                * 만약에 존재하지 않는 인덱스에 접근하게 되면
                *  StringIndexOutBoundsexception 이 발생한다.
                *
                * */

                Scanner sc = new Scanner(System.in);

                System.out.println("문자열 입력 : ");

                String str  = sc.nextLine();

                System.out.println("====== for 문 =====");
                for(int i = 0; i< str.length();i++){
                    char ch = str.charAt(i);
                    System.out.println( i + " : " +ch);
                }

                System.out.println("======= while문 =======");
                int index = 0;

                while(index < str.length()){
                    char ch = str.charAt(index);

                    System.out.println(index + " : " + ch);

                    index ++;


                }
            }

           public void testWhileExample2(){
                //정수 하나를 입력받은 정수까지의 합계를 구한다.

                Scanner sc = new Scanner(System.in);
                System.out.println("정수 하나를 입력해 주세요 : ");
                int num = sc.nextInt();

                int i = 1;

                int total = 0;

                while (i <= num){

                    total += i;

                    i++;
                }
                System.out.println("1부터 입력 받은 정수 " + num + "까지의 합은 " + total + "입니다.");
          }

          //중첩 while
          public void testWhileExample3(){
            /*
            * 중첩 while문을 이용해 구구단 출력하기
            * */

              int dan = 2;
              //2 * 4 = 8
              while(dan < 10){

                  int su  = 1;
                  // su가 1~9까지 반복
                  while(su < 10){

                      System.out.println(dan + " * " + su + " = " + (dan * su));

                      su++;
                  }

                  System.out.println();
                  dan++;
              }
          }
}


