package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class BookManager {

    private ArrayList<BookDTO> bookList;
    public BookManager() {
        // bookList 인스턴스 생성
        List<BookDTO> bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book) {
        //bookList에 도서 추가
        bookList.add(book);
    }

    public void deleteBook(int index) {
        //전달받은 index로 삭제
        bookList.remove(index);
    }

    public int searchBook(String title) {
        //도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
        //도서명이 일치하는 객체가 리스트에 없으면 -1을 리턴

        if(){

        }else {

        }
    }

    public void printBook(int index) {
        // index에 해당하는 객체 출력
    }

    public void displayAll() {
        // 도서 전체 리스트를 출력
        for (int i = 0; i<bookList.size();i++){
            System.out.println("======================");
            System.out.println("책 번호 :" + BookDTO.get(i).getbNO());
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {
        // 전달받은 매개변수의 값에 따라 정렬(1. 오름차순,2. 내림차순)
        // for문을 이용하여 ArrayList<BookDTO> 에 추가
        // 해당 배열 주소 값 리턴
    }

    public void printBookList(ArrayList<BookDTO> br) {
        // 향상된 for문을 이용하여 전달받은 ArrayList<BookDTO> 전체 출력
    }

}
