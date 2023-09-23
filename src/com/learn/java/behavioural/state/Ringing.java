package com.learn.java.behavioural.state;

public class Ringing implements MobileAlertState{
    @Override
    public void alert(AlertStateContext ctx)
    {
        System.out.println("Ringing...");
    }
}
