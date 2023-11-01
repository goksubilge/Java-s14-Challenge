package com.workinTechBurger.model;

public class Additions {
    private String addName;
    private double addPrice;

    public Additions(String addName, double addPrice) {
        this.addName = addName;
        this.addPrice = addPrice;
    }

    public String getAddName() {return addName;}
    public void setAddName(String addName) {this.addName = addName;}

    public double getAddPrice() {return addPrice;}

    public void setAddPrice(double addPrice) {this.addPrice = addPrice;}
}
