package com.ohgiraffers.section_test2.problem2;

/*
**문제 설명:**

  Joshua Bloch가 쓴 "Effective Java" 책을 만들고,
  416페이지이며 하드커버인 책 객체를 생성하여 값을 출력하세요.

*/

public class Application2 {
    public static void main(String[] args) {
        Book book = new Book();

        book.setName("Effective Java");
        book.setWriter("Joshua Bloch");
        book.setPage(416);
        book.setCover("하드커버");

        System.out.println((book.getInfo()));
    }
}
