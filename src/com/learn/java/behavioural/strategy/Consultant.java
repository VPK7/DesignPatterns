package com.learn.java.behavioural.strategy;

public class Consultant implements Role{
    @Override
    public String description() {
        return Consultant.class.getSimpleName();
    }

    @Override
    public String responsibilities() {
        return "Write Code";
    }
}
