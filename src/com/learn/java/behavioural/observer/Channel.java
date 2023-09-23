package com.learn.java.behavioural.observer;

public interface Channel {
    void subscribe(Subscriber sub);

    void unSubscribe(Subscriber sub);

    void notifySubscriber();

    void upload(String title);
}
