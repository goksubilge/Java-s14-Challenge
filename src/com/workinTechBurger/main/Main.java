package com.workinTechBurger.main;

import com.workinTechBurger.enums.BreadRollType;
import com.workinTechBurger.enums.Cipsees;
import com.workinTechBurger.enums.Drinkiees;
import com.workinTechBurger.model.Cpis;
import com.workinTechBurger.model.DeluxeBurger;
import com.workinTechBurger.model.Drinks;
import com.workinTechBurger.model.Hamburger;
import com.workinTechBurger.enums.Meat;
import com.workinTechBurger.model.HealthyBurger;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", Meat.BEEF, 3.56, BreadRollType.GOLD_SUN);

        hamburger.addHamburgerAddition("Tomato", 0.27);
        hamburger.addHamburgerAddition("Lettuce", 0.75);
        hamburger.addHamburgerAddition("Cheese", 1.13);

        hamburger.itemizeHamburger();



        DeluxeBurger db = new DeluxeBurger(new Cpis(Cipsees.CHEESE_FINGER), new Drinks(Drinkiees.BEER));

        db.addHamburgerAddition("Should not do this", 50.53);

        db.itemizeHamburger();



        HealthyBurger healthyBurger = new HealthyBurger("Healthy Vegan Burger", Meat.VEGAN,5.67,BreadRollType.YELLOW_DELUXE);

        healthyBurger.addHamburgerAddition("Egg", 5.43);
        healthyBurger.HealthyAddAdditions("Lentils", 3.41);

        healthyBurger.itemizeHamburger();
    }
}