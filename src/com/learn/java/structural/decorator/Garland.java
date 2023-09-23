package com.learn.java.structural.decorator;

public class Garland extends TreeDecorator {
    public Garland(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {

        return super.decorate() + "with Garland";
    }

}
