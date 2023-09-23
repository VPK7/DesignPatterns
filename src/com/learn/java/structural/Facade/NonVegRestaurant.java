package com.learn.java.structural.Facade;

import com.learn.java.structural.Facade.menus.Menus;
import com.learn.java.structural.Facade.menus.NonVegMenu;

public class NonVegRestaurant implements Hotel{

    public Menus getMenus()
    {
        NonVegMenu nv = new NonVegMenu();
        return nv;
    }
}
