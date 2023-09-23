package com.learn.java.creational.singleton;

public class SingletonSynchronizeMethod {
    private static SingletonSynchronizeMethod instance;
    private SingletonSynchronizeMethod(){

    }
    public static synchronized SingletonSynchronizeMethod getInstance(){
        if(instance==null){
            instance= new SingletonSynchronizeMethod();
        }
        return instance;
    }
}
