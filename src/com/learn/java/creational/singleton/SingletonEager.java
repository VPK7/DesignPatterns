package com.learn.java.creational.singleton;

/**
 * Eager initialization
 * when we are declaring the variable we are initializing
 */
public class SingletonEager {
    private static SingletonEager instance=new SingletonEager();
    private SingletonEager(){

    }
    public static SingletonEager getInstance(){

        return instance;
    }
}
