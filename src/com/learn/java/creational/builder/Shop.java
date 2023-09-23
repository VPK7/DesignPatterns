package com.learn.java.creational.builder;

/**
 * this will create object of phone
 */
public class Shop {
    public static void main(String[] args) {
        Phone phone=new Phone("Android",8,"Qualcomm",6.5,5000);
        System.out.println(phone);
        /**
         * above we are passing values in constructor sometimes we it might be difficult to remember the number of objects
         * and their sequence and we dont want to pass some values  in that case we go with builder pattern
         * so we can create one more class which will responsible to create phone for us.
         */

        Phone p=new PhoneBuilder().setRam(8).setBattery(5000).getPhone();
        /**
         * here even if we are not passing all the values, remaining values will be default and we get phone obj
         */
        System.out.println(p);
    }
}
