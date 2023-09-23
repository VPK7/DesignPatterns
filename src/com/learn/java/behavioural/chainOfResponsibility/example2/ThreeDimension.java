package com.learn.java.behavioural.chainOfResponsibility.example2;

import java.util.Arrays;

public class ThreeDimension implements Chain{
    private Chain nextInChain;
    @Override
    public void setNext(Chain c){
        this.nextInChain=c;
    }
    @Override
    public void process(Dimension request){
        if(request.getCoordinate().length==3){
            System.out.println("ThreeDimension Coordinate: "+ Arrays.toString(request.getCoordinate()));
        }
        else {
            //nextInChain.process(request);
        }
    }

}
