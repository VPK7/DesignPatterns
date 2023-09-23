package com.learn.java.creational.abstractFactory;

public class Client {
    public static void main(String[] args) {
        AbstractDeviceFactory mobileFactory=FactoryGenerator.getFactory(FactoryType.MOBILEFACTORY);
        Device Nokia=mobileFactory.getGadget(DeviceType.NOKIA);
        System.out.println(Nokia);
    }
}
