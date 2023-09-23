package com.learn.java.structural.adopter;

public class PenAdopter implements  Pen{
    PilotPen pp =new PilotPen();

    @Override
    public void write(String str) {
        pp.mark(str);
    }
}
