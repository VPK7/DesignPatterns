package com.learn.java.structural.Facade;

import com.learn.java.structural.Facade.menus.Menus;
import com.learn.java.structural.Facade.menus.VegMenu;

public class VegRestaurant implements Hotel{
    public Menus getMenus()
    {
        VegMenu v = new VegMenu();
        return v;
    }
}
