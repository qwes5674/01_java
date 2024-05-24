package com.ohgiraffers.section_test2.problem4;

public class Application4 {
    /*
     **문제 설명:**
  나이가 30살이고 이름이 James인 남자가 있습니다.
  이 남자는 결혼을 했고 자식이 셋 있습니다.
  이를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.
    * */

    public static void main(String[] args) {

        Human human = new Human();

        human.setAge(30);
        human.setChildren(3);
        human.setMarry(true);
        human.setGender('남');
        human.setName("James");

        System.out.print((human.getInfo()));
    }
}
