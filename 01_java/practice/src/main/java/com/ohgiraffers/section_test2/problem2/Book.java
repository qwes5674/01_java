package com.ohgiraffers.section_test2.problem2;

public class Book {
    private String name ;
    private String writer;
    private String cover;
    private int page;

    public void setName(String name){
        this.name = name;
    }

    public void setWriter(String writer){
        this.writer = writer;
    }

    public void setCover(String cover){

        this.cover = cover;
    }

    public void setPage(int page){
        this.page=page;
    }

    public String getInfo (){
        return "저자는 " + this.writer +"이고, 책 이름은 " + this.name+ "이고,총 페이지는 " + this.page+"이고, 커버는 "
                + this.cover + "이다.";
    }

}
