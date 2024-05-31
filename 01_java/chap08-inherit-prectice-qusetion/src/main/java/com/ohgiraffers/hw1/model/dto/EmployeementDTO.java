package com.ohgiraffers.hw1.model.dto;

public class EmployeementDTO extends PersonDTO {

    private int salary;
    private String dept;

    public EmployeementDTO() {

    }

    public EmployeementDTO( String name, int age, double height, double weight,
                            int salary, String  dept ) {
        super();
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
