package com.learn.java.behavioural.chainOfResponsibility.example2;



public interface Chain {
    void setNext(Chain nextInChain);
    void process(Dimension request);
}
