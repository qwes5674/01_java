package com.ohgiraffers.section_test2.problem5;

/*
* **문제 설명:**
Dell 브랜드의 XPS 13 모델이고, 16GB RAM과 512GB SSD를 가진 노트북을 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.

노트북

- 브랜드
- 모델명
- 램용량
- SSD용량
* */

public class Application5 {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("Dell", "xps13",
                16,512);

        System.out.println(notebook.getInfo());
    }
}
