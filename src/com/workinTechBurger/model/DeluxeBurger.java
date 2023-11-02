package com.workinTechBurger.model;

import com.workinTechBurger.enums.BreadRollType;
import com.workinTechBurger.enums.Meat;

public class DeluxeBurger extends Hamburger {
    private Cpis cip;
    private Drinks drink;

    public DeluxeBurger( Cpis cip, Drinks drink ) {
        super("deluxe_burger", Meat.DELUXE_BEEF, 19.10,BreadRollType.NIGHT_AUTOBAHN );
        this.cip = cip;
        this.drink = drink;
    }

    @Override
    public void addHamburgerAddition(String name, double price) {
        System.out.println("Warning! You don't add a new addition to Deluxe Burger ! ");
    }
    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cip Type : " + cip.getCip().name() + "\n");
        builder.append("Drink Type : " + drink.getDrink().name() + "\n");
        System.out.println(builder + "\n");
        super.itemizeHamburger();
    }
}
