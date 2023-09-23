package com.learn.java.creational.fatory;

/**
 * this is class which manufactures and gives us the object
 */
public class OperatingSystemFactory {
    public OS getInstance(String str){
        if(str.equals("Open"))
            return new Android();
        else if(str.equals("Closed"))
            return new IOS();
        else
            return new Windows();
    }
}

/*
Interface Vehli{


}
Vehil obj=new car();

obj.

public class Vehicle{

    mehotd1//

}
Vehicle obj=new Vehicle();
        obj.mehotod*/
