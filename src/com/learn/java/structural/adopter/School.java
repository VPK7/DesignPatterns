package com.learn.java.structural.adopter;

public class School {
    public static void main(String[] args) {
        AssignmentWork aw=new AssignmentWork();
        /**
         * here we don't have implementation class for pen Interface
         * and we cant crete object for it
         */
        //aw.writeAssignment("I'm bit tired to write an assignment");//give null pointer exception

        Pen p=new PenAdopter();
        aw.setP(p);
        aw.writeAssignment("I'm bit tired to write an assignment");//check baeldung once again for reference
    }
}
