package com.learn.java.structural.Facade;

import com.learn.java.structural.Facade.menus.Both;
import com.learn.java.structural.Facade.menus.Menus;

public class VegNonBothRestaurant implements Hotel{
    public Menus getMenus()
    {
        Both b = new Both();
        return b;
    }
}
