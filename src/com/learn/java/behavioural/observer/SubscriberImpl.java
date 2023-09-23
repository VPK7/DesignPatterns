package com.learn.java.behavioural.observer;

public class SubscriberImpl implements Subscriber {

    private String name;
    private Channel channel=new ChannelImpl();

    public SubscriberImpl(String name) {
        this.name = name;
    }


    @Override
    public void update(){
        System.out.println("Hi "+name+" Video Uploaded");
    }
    @Override
    public void subscribeChannel(Channel ch){
        channel=ch;
    }
}
