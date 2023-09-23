package com.learn.java.behavioural.strategy;

public class LeadConsultant implements Role{
    public String description() {
        return LeadConsultant.class.getSimpleName();
    }

    @Override
    public String responsibilities() {
        return "Make tech decisions";
    }
}
