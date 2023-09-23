package com.learn.java.structural.Facade;

import com.learn.java.structural.Facade.menus.Both;
import com.learn.java.structural.Facade.menus.NonVegMenu;
import com.learn.java.structural.Facade.menus.VegMenu;

/**This is the Facade
 * From this, It is clear that the complex implementation will be done by HotelKeeper himself.
 * The client will just access the HotelKeeper and ask for either Veg, NonVeg or VegNon Both Restaurant menu.
 */
public class HotelKeeper {
    public VegMenu getVegMenu()
    {
        VegRestaurant v = new VegRestaurant();
        VegMenu vegMenu = (VegMenu)v.getMenus();
        return vegMenu;
    }

    public NonVegMenu getNonVegMenu()
    {
        NonVegRestaurant v = new NonVegRestaurant();
        NonVegMenu NonvegMenu = (NonVegMenu)v.getMenus();
        return NonvegMenu;
    }

    public Both getVegNonMenu()
    {
        VegNonBothRestaurant v = new VegNonBothRestaurant();
        Both bothMenu = (Both)v.getMenus();
        return bothMenu;
    }
}
