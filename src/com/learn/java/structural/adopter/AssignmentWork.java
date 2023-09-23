package com.learn.java.structural.adopter;

public class AssignmentWork {

    /**
     * to write a assignment we require a pen
     */
    private Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    /**
     * @param str
     */
    public void writeAssignment(String str){
        /**
         * since we cant create object for pen Interface, it will throw null pointer exception,
         * to avoid that we need to adopter, we can use other class object to pen Interface.
         */
        p.write(str);
    }
}
