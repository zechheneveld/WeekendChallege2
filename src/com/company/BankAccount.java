package com.company;

public class BankAccount {

    public String name;
    public String accountNumber;
    public double balance;

    public BankAccount(String name, String accountNumber, double balance){

        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;

        //System.out.println("Bank account was created");
    }

    public void deposit(int value){
        this.balance += value;
    }

    public void withdraw(int value){
        this.balance -= value;
    }

    @Override
    public String toString() {
return "Jakes account has " + balance;
    }


}
