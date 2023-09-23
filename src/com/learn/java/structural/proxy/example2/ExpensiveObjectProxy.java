package com.learn.java.structural.proxy.example2;

public class ExpensiveObjectProxy implements ExpensiveObject{
    private static ExpensiveObject object;

    @Override
    public void process() {
        if(object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }
}
