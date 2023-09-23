package com.learn.java.creational.singleton;

public class SingletonSynchronizedBlock {
    private static SingletonSynchronizedBlock instance;
    private SingletonSynchronizedBlock(){

    }
    public static  SingletonSynchronizedBlock getInstance(){
        if(instance==null){
            synchronized (SingletonSynchronizedBlock.class){
                if(instance==null){
                    instance= new SingletonSynchronizedBlock();
                }
            }
        }
        return instance;
    }
}



//Class pub{
//    static int a;
//    int b;
//
//        }
//
//        pub p =new pub();
//        pub q=new pub();