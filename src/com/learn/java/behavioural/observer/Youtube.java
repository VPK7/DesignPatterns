package com.learn.java.behavioural.observer;

public class Youtube {
    public static void main(String[] args) {
        Channel ch=new ChannelImpl();
        Subscriber s1=new SubscriberImpl("vara");
        Subscriber s2=new SubscriberImpl("prasad");

        ch.subscribe(s1);
        ch.subscribe(s2);

        s1.subscribeChannel(ch);
        s1.subscribeChannel(ch);

        ch.upload("how to learn deisng patterns");


    }
}
