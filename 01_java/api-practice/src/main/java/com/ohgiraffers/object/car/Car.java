package com.ohgiraffers.object.car;

public class Car {
    private String carName;
    private String carColor;
    private int enginCC;

    public Car(String carName, String carColor, int enginCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.enginCC = enginCC;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getEnginCC() {
        return enginCC;
    }

    public void setEnginCC(int enginCC) {
        this.enginCC = enginCC;
    }


    @Override
    public int hashCode() {

        if()

        return super.hashCode();
    }
}
