package com.workinTechBurger.model;

import com.workinTechBurger.enums.BreadRollType;
import com.workinTechBurger.enums.Meat;

public class Hamburger implements AddAdditions {
    private String name;
    private Meat meat;
    private double price;
    protected BreadRollType breadRollType;
    private Additions addition1;
    private Additions addition2;
    private Additions addition3;
    private Additions addition4;

    public Hamburger(String name, Meat meat, double price, BreadRollType breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public Meat getMeat() {return meat;}
    public void setMeat(Meat meat) {this.meat = meat;}
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
    public BreadRollType getBreadRollType() {return breadRollType;}
    public void setBreadRollType(BreadRollType breadRollType) {this.breadRollType = breadRollType;}
    public Additions getAddition1() {return addition1;}
    public void setAddition1(Additions addition1) {
        this.addition1 = addition1;}
    public Additions getAddition2() {return addition2;}
    public void setAddition2(Additions addition2) {addition2 = addition2;}
    public Additions getAddition3() {return addition3;}
    public void setAddition3(Additions addition3) {addition3 = addition3;}
    public Additions getAddition4() {return addition4;}
    public void setAddition4(Additions addition4) {addition4 = addition4;}

    @Override
    public void addHamburgerAddition(String name, double price) {
        if (addition1 == null) {
            addition1 = new Additions (name, price);
        }
        else if (addition2 == null){
            addition2 = new Additions(name, price);
        }
        else if (addition3 == null){
            addition3 = new Additions(name, price);
        }
        else if (addition4 == null){
            addition4 = new Additions(name, price);
        }
        else {
            System.out.println(" hamburger Full");
        }
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", meat=" + meat +
                ", price=" + price +
                ", breadRollType=" + breadRollType +
                ", addition1=" + addition1 +
                ", addition2=" + addition2 +
                ", addition3=" + addition3 +
                ", addition4=" + addition4 +
                '}';
    }
    public void itemizeHamburger(){
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + name + "\n");
        builder.append("Meat: " + meat + "\n");
        builder.append("BreadRollType: " + breadRollType.name() + "\n");

        if(getAddition1() != null){
            builder.append("Addition1:" + getAddition1().getAddName() + "\n");
            setPrice(price + getAddition1().getAddPrice());
        }
        if(getAddition2() != null){
            builder.append("Addition2:" + getAddition2().getAddName() + "\n");
            setPrice(price + getAddition2().getAddPrice());
        }
        if(getAddition3() != null){
            builder.append("Addition3:" + getAddition3().getAddName() + "\n");
            setPrice(price + getAddition3().getAddPrice());
        }
        if(getAddition4() != null){
            builder.append("Addition4:" + getAddition4().getAddName() + "\n");
            setPrice(price + getAddition4().getAddPrice());
        }
        System.out.println(builder);
        System.out.println("Total Price: " + getPrice());
        System.out.println("****************************");

    }
}
