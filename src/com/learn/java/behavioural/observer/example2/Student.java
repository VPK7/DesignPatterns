package com.learn.java.behavioural.observer.example2;

public class Student {

    Professor professor=new Professor();

    String getNotification(){
        return " got update from professor";
    }
}
