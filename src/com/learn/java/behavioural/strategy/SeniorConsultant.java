package com.learn.java.behavioural.strategy;

public class SeniorConsultant implements Role{
    @Override
    public String description() {
        return SeniorConsultant.class.getSimpleName();
    }

    @Override
    public String responsibilities() {
        return "Review Code";
    }
}
