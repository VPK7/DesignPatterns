package com.learn.java.structural.adopter.example2;

public class WebDriverAdapter implements WebDriver{

    private IEDriver ieDriver;

    public WebDriverAdapter() {
        ieDriver=new IEDriver();
    }

    @Override
    public void getElement() {
        ieDriver.findElement();

    }

    @Override
    public void selectElement() {
        ieDriver.clickElement();
    }
}
