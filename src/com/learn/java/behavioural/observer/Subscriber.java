package com.learn.java.behavioural.observer;

public interface Subscriber {
    void update();

    void subscribeChannel(Channel ch);
}
