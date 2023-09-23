package com.learn.java.structural.adopter.example2;

public class ChromeDriver implements WebDriver{
    @Override
    public void getElement() {
        System.out.println("Get element from ChromeDriver");
    }

    @Override
    public void selectElement() {
        System.out.println("Select element from ChromeDriver");

    }
}
