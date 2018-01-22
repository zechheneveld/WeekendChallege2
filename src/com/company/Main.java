package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//Main Bank Account

        BankAccount zechAcc = new BankAccount("Zech", "12345", 0);
        BankAccount jakeAcc = new BankAccount("Jake", "98765", 0);
        BankAccount scottAcc = new BankAccount("Scott", "54321", 0);
        BankAccount joanAcc = new BankAccount("Joan", "47829", 0);
        BankAccount loriAcc = new BankAccount("Lori", "39487", 0);
        BankAccount mannyAcc = new BankAccount("Manny", "39482", 0);
        BankAccount koddyAcc = new BankAccount("Koddy", "39201", 0);
        BankAccount tedAcc = new BankAccount("Ted", "92826", 0);
        BankAccount markAcc = new BankAccount("Mark", "94837", 0);
        BankAccount kymAcc = new BankAccount("Kym", "93827", 0);


        zechAcc.deposit(57000);
        jakeAcc.deposit(57000);
        joanAcc.deposit(57000);
        scottAcc.deposit(57000);
        loriAcc.deposit(57000);
        mannyAcc.deposit(57000);
        koddyAcc.deposit(57000);
        tedAcc.deposit(57000);
        markAcc.deposit(57000);
        kymAcc.deposit(57000);

        jakeAcc.withdraw(0);

        System.out.println("Jake has " + jakeAcc);
        System.out.println("Zech has " + zechAcc);

        }

    }

