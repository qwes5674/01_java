package com.ohgiraffers.section03;

public class Account {

    private String ownerName;
    private int balance;

    public Account(String s) {
    }

    // 기본 생성자, ownerName만 대기변수로 있는 생성자
    // getter, setter ,toString 오버라이딩 -> 모든 필드가 출력되게


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String
    toString() {
        return "Account{" +
                "ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
