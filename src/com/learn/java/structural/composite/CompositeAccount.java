package com.learn.java.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeAccount implements Account{
    private float totalBalance;
    private List<Account> accountList = new ArrayList<Account>();

    public void addAccount(Account acc) {
        accountList.add(acc);//saving(b100),saving(200),Deposit(3000)
    }

    public float getBalance() {
        totalBalance = 0;
        for (Account f : accountList) {
            totalBalance = totalBalance + f.getBalance();
        }
        return totalBalance;
    }


    public void removeAccount(Account acc) {
        accountList.add(acc);
    }
}
