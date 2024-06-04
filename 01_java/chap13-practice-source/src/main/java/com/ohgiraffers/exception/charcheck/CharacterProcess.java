package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class CharacterProcess {

    /*
     1. 전달된 문자열값에서 영문자가 몇개인지 카운트해서 리턴
     2. 단, 공백문자가 있으면, `CharCheckException` 발생
    * */

    public int countAlpha(String s){


        // 1. 영어 문자열을 입력받는다.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // 2. 알파벳을 카운트할 배열을 만든다. (a~z)
        char[] alphas = new char[26];
        for(int i = 0; i < 26; i++){
            alphas[i] = 0;
        }

        // 3. 영어 문장에서 각 알파벳을 뽑아 알파벳 개수 카운트
        for(int i = 0; i < str.length(); i++){ //문자열 길이 만큼 반복
            char ch = str.charAt(i);  // 각 알파벳을 뽑는다
          if(ch >= 'a' && ch <= 'z'){
              alphas[ch - 'a']++;
          }
        }

        for(char x = 'a'; x< 'z'; x++){
            System.out.println(x + ":" + ((int) alphas [x-'a']));
        }


    }
}
