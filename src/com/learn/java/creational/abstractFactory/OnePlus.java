package com.learn.java.creational.abstractFactory;

public class OnePlus extends Device{
    private String ram;
    private String processor;

    @Override
    public String toString() {
        return "OnePlus{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }

    public OnePlus(String ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String getDetails() {
        return this.toString();
    }
}
