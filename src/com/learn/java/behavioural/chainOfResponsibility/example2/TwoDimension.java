package com.learn.java.behavioural.chainOfResponsibility.example2;

import java.util.Arrays;

public class TwoDimension implements Chain{
    private Chain nextInChain;
    @Override
    public void setNext(Chain c){
        this.nextInChain=c;
    }
    @Override
    public void process(Dimension request){
        if(request.getCoordinate().length==2){
            System.out.println("TwoDimension Coordinate: "+ Arrays.toString(request.getCoordinate()));
        }
        else {
            nextInChain.process(request);
        }
    }

}
