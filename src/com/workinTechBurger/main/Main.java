package com.workinTechBurger.main;

import com.workinTechBurger.enums.BreadRollType;
import com.workinTechBurger.model.Hamburger;
import com.workinTechBurger.enums.Meat;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", Meat.BEEF, 3.56, BreadRollType.GOLD_SUN);

        hamburger.addHamburgerAddition("Tomato", 0.27);

        hamburger.addHamburgerAddition("Lettuce", 0.75);

        hamburger.addHamburgerAddition("Cheese", 1.13);

        hamburger.itemizeHamburger();
    }
}