package com.learn.java.structural.proxy.example;

public class DatabaseExecuterImpl implements DatabaseExecuter{
    @Override
    public void executeDatabase(String query) throws Exception {
        System.out.println("Going to execute Query: " + query);
    }
}
