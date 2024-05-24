package com.ohgiraffers.section_test2.problem2;

/*
**문제 설명:**

  Joshua Bloch가 쓴 "Effective Java" 책을 만들고,
  416페이지이며 하드커버인 책 객체를 생성하여 값을 출력하세요.

*/

public class Application2 {
    public static void main(String[] args) {
        Book book = new Book();

        book.name = "Effective Java";
        book.writer ="Joshua Bloch";
        book.page = 416;
        book.cover = "hardcover";

        System.out.println("저자는 " + book.writer +"이고, 책 이름은 " + book.name+ "이고,총 페이지는 " + book.page+"이고, 커버는 "
        + book.cover + "이다.");
    }
}
