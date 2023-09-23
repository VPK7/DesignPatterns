package com.learn.java.structural.proxy.example3;

public class RealInternet implements Internet{
    @Override
    public void connectTo(String serverhost) throws Exception {
        System.out.println("Connecting to "+ serverhost);
    }
}
