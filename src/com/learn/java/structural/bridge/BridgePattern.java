package com.learn.java.structural.bridge;

import com.learn.java.structural.bridge.abstraction.Bike;
import com.learn.java.structural.bridge.abstraction.Car;
import com.learn.java.structural.bridge.abstraction.Vehicle;
import com.learn.java.structural.bridge.implementor.Assemble;
import com.learn.java.structural.bridge.implementor.Produce;

public class BridgePattern {
    public static void main(String[] args)
    {
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());

        vehicle1.manufacture();
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();
    }
}
