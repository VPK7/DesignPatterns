package com.learn.java.behavioural.chainOfResponsibility.example2;

import java.util.Arrays;

public class OneDimension implements Chain{
    private Chain nextInChain;
    @Override
    public void setNext(Chain c){
        this.nextInChain=c;
    }
    @Override
    public void process(Dimension request){
        if(request.getCoordinate().length==1){
            System.out.println("OneDimension Coordinate: "+ Arrays.toString(request.getCoordinate()));
        }
        else {
            if(request!=null)
            nextInChain.process(request);
        }
    }

}
