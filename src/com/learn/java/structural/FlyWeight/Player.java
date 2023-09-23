package com.learn.java.structural.FlyWeight;

// A Java program to demonstrate working of
// FlyWeight Pattern with example of Counter
// Strike Game

// A common interface for all players
public interface Player
{
    public void assignWeapon(String weapon);
    public void mission();
}