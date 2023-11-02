package com.workinTechBurger.model;

import com.workinTechBurger.enums.BreadRollType;
import com.workinTechBurger.enums.Meat;

public class HealthyBurger extends Hamburger implements HealthyAddAdditions {
    private Additions addHealthyAdd1;
    private Additions addHealthyAdd2;

    public HealthyBurger(String name, Meat meat, double price, BreadRollType breadRollType) {
        super(name, Meat.VEGAN, price, breadRollType);
        // setMeat("vegan") // eğer enum yapmasaydım superin altında böyle tanımlardım.
    }
    public Additions getAddHealthyAdd1() {return addHealthyAdd1;}
    public Additions getAddHealthyAdd2() {return addHealthyAdd2;}

    @Override
    public void HealthyAddAdditions(String name, double price) {
        if (addHealthyAdd1 == null) {
            addHealthyAdd1 = new Additions (name, price);
        }
        else if (addHealthyAdd2 == null){
            addHealthyAdd2 = new Additions(name, price);
        }
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        if(getAddHealthyAdd1() != null) {
            builder.append("Healthy Addition 1: " + getAddHealthyAdd1().getAddName() + "\n");
            setPrice(getPrice() + getAddHealthyAdd1().getAddPrice());
        }
        if(getAddHealthyAdd2() != null) {
            builder.append("Healthy Addition 2 :" +getAddHealthyAdd2().getAddName() + "\n");
            setPrice(getPrice() + getAddHealthyAdd2().getAddPrice());
        }
        System.out.println(builder);
        System.out.println("****************************");
        super.itemizeHamburger();
    }
}
