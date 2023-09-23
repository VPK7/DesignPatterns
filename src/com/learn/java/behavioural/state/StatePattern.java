package com.learn.java.behavioural.state;

public class StatePattern {
    public static void main(String[] args)
    {
        AlertStateContext stateContext = new AlertStateContext();
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
        stateContext.setState(new Ringing());
        stateContext.alert();

        stateContext.alert();
        stateContext.alert();
    }
}
