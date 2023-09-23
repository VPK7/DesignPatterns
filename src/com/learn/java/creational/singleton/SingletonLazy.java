package com.learn.java.creational.singleton;

/**
 * Lazy initialization
 * Object will be created when getInstance method will
 * it is not thread safe
 */
public class SingletonLazy {
    private static SingletonLazy instance;
    SingletonLazy(){

    }
    public static SingletonLazy getInstance(){
        if(instance==null){
            instance= new SingletonLazy();
        }
        return instance;
    }
}
