package com.learn.java.creational.abstractFactory;

public class Dell extends Device{
    private String ram;
    private String processor;
    private String gpu;

    @Override
    public String toString() {
        return "Dell{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }

    public Dell(String ram, String processor, String gpu){
        this.ram=ram;
        this.processor=processor;
        this.gpu = gpu;
    }
    @Override
    public String getDetails() {
        return "Dell : ram :"+this.ram+" and processor :"+this.processor;
    }

}
