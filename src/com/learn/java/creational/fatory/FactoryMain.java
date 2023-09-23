package com.learn.java.creational.fatory;

public class FactoryMain {
    public static void main(String[] args) {
        //OS obj=new Android();//obj.spec(); if we want to change from android to windows or to ios, we need to change the code
        //OS obj=new IOS(); obj.spec(); and we need to recompile it , that means our client knows which class you are using since
        //OS obj=new Windows(); obj.spec(); you are using the keyword Android,
        //there fore factory pattern says instead of creating directly object, we can create a class(operatingSystemFactory)
        // which will object of os.
        //obj.spec();
        /**
         * we no need change the code here in the client application
         * in future if we get new class also we can change code in OperatingSystemFactory but not here
         */
        OperatingSystemFactory osf=new OperatingSystemFactory();
        OS obj=osf.getInstance("Closed");// here based on the need we get object of that class
        obj.spec();
    }
}
