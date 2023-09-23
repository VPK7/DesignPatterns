package com.learn.java.structural.adopter.example2;

public class AdapterDesignPattern {
    public static void main(String[] args) {
        WebDriver a = new ChromeDriver();
        a.getElement();
        a.selectElement();

        /*IEDriver e = new IEDriver();
        e.findElement();
        e.clickElement();*/

        WebDriver wID = new WebDriverAdapter();
        wID.getElement();
        wID.selectElement();

    }
}
