package com.learn.java.creational.abstractFactory;

public class LaptopFactory extends AbstractDeviceFactory{
    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType){
            case HP:
                return new HP("8gb","i5","AMD");
            case DELL:
                return new Dell("8gb","i5","NVIDA");
        }
        return null;
    }
}
