package com.learn.java.structural.proxy.example2;

public class ProxyPatternDriver {
    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}
