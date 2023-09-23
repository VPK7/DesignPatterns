package com.learn.java.creational.abstractFactory;

public class MobileFactory extends AbstractDeviceFactory{
    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType){
            case NOKIA:
                return new Nokia("8gb","qualcum");
            case ONEPLUS:
                return new OnePlus("8gb","intel");
        }
        return null;
    }
}
