package com.ohgiraffers.section_test2.problem5;

public class Notebook {
    private String brand;
    private String model;
    private int ram;
    private int ssd;

    public Notebook(String brand,String model, int ram,int ssd){
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }
    public String getInfo(){
        return this.brand + " 브랜드의 " + this.model + " 모델이고,"
                +this.ssd + "GB RAM과 " + this.ram + "GB SSD를 가진 노트북";
    }
}
