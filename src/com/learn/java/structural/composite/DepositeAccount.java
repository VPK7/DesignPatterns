package com.learn.java.structural.composite;

public class DepositeAccount implements Account{
    private String accountNo;
    private float accountBalance;

    public DepositeAccount(String accountNo, float accountBalance) {
        super();
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    @Override
    public float getBalance() {

        return accountBalance;
    }
}
