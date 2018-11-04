package com.example.paul.reggie.model;

import java.util.UUID;

public class Accounts {
    private String accountID;
    private String accountName;
    private double accountCurrentBalance;
    private double accountPendingPayments;
    private double accountPendingDeposits;
    private double accountAvailableBalance;

    //No argument constructor
    public Accounts(){

    }

    //Standard Constructor
    public Accounts(String accountID, String accountName, double accountCurrentBalance,
                    double accountPendingPayments, double accountPendingDeposits,
                    double accountAvailableBalance){
        if(accountID == null){
            accountID = UUID.randomUUID().toString();
        }

        this.accountID = accountID;
        this.accountName = accountName;
        this.accountCurrentBalance = accountCurrentBalance;
        this.accountPendingPayments = accountPendingPayments;
        this.accountPendingDeposits = accountPendingDeposits;
        this.accountAvailableBalance = accountAvailableBalance;
    }


    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountCurrentBalance() {
        return accountCurrentBalance;
    }

    public void setAccountCurrentBalance(double accountCurrentBalance) {
        this.accountCurrentBalance = accountCurrentBalance;
    }

    public double getAccountPendingPayments() {
        return accountPendingPayments;
    }

    public void setAccountPendingPayments(double accountPendingPayments) {
        this.accountPendingPayments = accountPendingPayments;
    }

    public double getAccountPendingDeposits() {
        return accountPendingDeposits;
    }

    public void setAccountPendingDeposits(double accountPendingDeposits) {
        this.accountPendingDeposits = accountPendingDeposits;
    }

    public double getAccountAvailableBalance() {
        return accountAvailableBalance;
    }

    public void setAccountAvailableBalance(double accountAvailableBalance) {
        this.accountAvailableBalance = accountAvailableBalance;
    }
}
