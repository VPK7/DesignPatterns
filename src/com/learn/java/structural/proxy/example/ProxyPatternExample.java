package com.learn.java.structural.proxy.example;

public class ProxyPatternExample {
    public static void main(String[] args) throws Exception {

        DatabaseExecuter obj=new DatabaseExecuterImpl();
        obj.executeDatabase("delete query");

        DatabaseExecuter nonAdminExecuter = new DatabaseExecuterProxy("NonAdmin", "Admin@123");
        nonAdminExecuter.executeDatabase("DELEE");

        DatabaseExecuter nonAdminExecuterDELETE = new DatabaseExecuterProxy("NonAdmin", "Admin@123");
        nonAdminExecuterDELETE.executeDatabase("DELETE");


        DatabaseExecuter adminExecuter = new DatabaseExecuterProxy("Admin", "Admin@123");
        adminExecuter.executeDatabase("DELETE");

    }
}
