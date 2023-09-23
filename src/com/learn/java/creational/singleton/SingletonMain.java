package com.learn.java.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonEager eager1= SingletonEager.getInstance();
        SingletonEager eager2= SingletonEager.getInstance();
        System.out.println(eager1.hashCode()==eager2.hashCode());

        SingletonLazy lazy1=new SingletonLazy();
        SingletonLazy.getInstance();
        SingletonLazy lazy2=SingletonLazy.getInstance();
        System.out.println(lazy1.hashCode()==lazy2.hashCode());

        SingletonSynchronizeMethod synchronizeMethod1=SingletonSynchronizeMethod.getInstance();
        SingletonSynchronizeMethod synchronizeMethod2=SingletonSynchronizeMethod.getInstance();
        System.out.println(synchronizeMethod1.hashCode()==synchronizeMethod2.hashCode());

        SingletonSynchronizedBlock synchronizedBlock1=SingletonSynchronizedBlock.getInstance();
        SingletonSynchronizedBlock synchronizedBlock2=SingletonSynchronizedBlock.getInstance();
        System.out.println(synchronizedBlock1.hashCode()==synchronizedBlock2.hashCode());
    }
}
