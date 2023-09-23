package com.learn.java.behavioural.chainOfResponsibility.example3;


public class DivideNumbers implements Chain {

    @Override
    public void setNextChain(Chain nextChain) {

    }

    @Override
    public void calculate(Numbers request) {

        if(request.getCalcWanted() == "div"){

            System.out.print(request.getNumber1() + " / " + request.getNumber2() + " = "+
                    (request.getNumber1()/request.getNumber2()));

        } else {

            System.out.print("Only works for add, sub, mult, and div");

        }
    }
}
