package com.learn.java.structural.Facade;

import com.learn.java.structural.Facade.menus.Menus;

/**
 * The hotel interface only returns Menus.
 * Similarly, the Restaurant are of three types and can implement the hotel interface.
 */

public interface Hotel {
    public Menus getMenus();
}
