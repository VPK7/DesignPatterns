package com.learn.java.creational.abstractFactory;

public class Nokia extends Device{
    private String ram;
    private String processor;

    @Override
    public String toString() {
        return "Nokia{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }

    public Nokia(String ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String getDetails() {
        return this.toString();
    }
}
