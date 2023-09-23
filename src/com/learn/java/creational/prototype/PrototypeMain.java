package com.learn.java.creational.prototype;

public class PrototypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs=new BookShop();
        bs.setShopName("Novelty");
        bs.loadData();

        BookShop bs1= (BookShop) bs.clone();//shallow cloning and deep cloning, it is there in object class and it is protected, we need to
        //implement cloneable interface, it is a marker interface which don't have any methods
        bs.getBooks().remove(2);
        bs1.setShopName("A1");
       // System.out.println(bs);//
        //System.out.println(bs1);//even without loading the data we get the result
        /**
        *the above is shallow cloning i.e., if we remove object 2 in bs it also effects in bs1, that means it is not creating
         * a new object for us ,we just have one object and two references to it bs and bs1 are pointing
         * to same reference
         */

        /**
         * to create seperate objects we need to go for deep cloning
         */
        BookShop bs2=  bs.clone();
        bs.getBooks().remove(2);
        bs2.setShopName("A2");
        System.out.println(bs);
        System.out.println(bs2);
    }
}
