package com.learn.java.behavioural.strategy;

public class Main {
    public static void main(String[] args) {

        System.out.println("=======Before promotion=======\n");
        Role consultant=new Consultant();
        System.out.println(consultant.description());//
        System.out.println(consultant.responsibilities());//

/**
 * if we want to change dynamically the alogorithm like promote the consultant to seinor consultant
 * then introduce a new Employee class for making dynmaic changes of algorithms
 */
        Employee ram = new Employee("Ram", new Consultant());
        Employee rahul = new Employee("Rahul", new SeniorConsultant());

        ram.doWork();
        rahul.doWork();

        ram.promote(new SeniorConsultant());
        rahul.promote(new LeadConsultant());

        System.out.println("\n=======After promotion=======\n");

        ram.doWork();
        rahul.doWork();
    }
}
