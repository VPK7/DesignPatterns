package com.learn.java.structural.Facade;

import com.learn.java.structural.Facade.menus.Both;
import com.learn.java.structural.Facade.menus.NonVegMenu;
import com.learn.java.structural.Facade.menus.VegMenu;

public class Client {

    public static void main (String[] args)
    {
        HotelKeeper keeper = new HotelKeeper();

        VegMenu v = keeper.getVegMenu();
        NonVegMenu nv = keeper.getNonVegMenu();
        Both b= keeper.getVegNonMenu();

    }
}
