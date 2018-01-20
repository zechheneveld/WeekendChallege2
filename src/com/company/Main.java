package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//Main Bank Account

        BankAccount zechAcc = new BankAccount("Zech", "12345", 57000);
        BankAccount jakeAcc = new BankAccount("Jake", "98765", 57000);
        BankAccount scottAcc = new BankAccount("Scott", "54321", 57000);
        BankAccount joanAcc = new BankAccount("Joan", "47829", 57000);
        BankAccount loriAcc = new BankAccount("Lori", "39487", 57000);
        BankAccount mannyAcc = new BankAccount("Manny", "39482", 57000);
        BankAccount koddyAcc = new BankAccount("Koddy", "39201", 57000);
        BankAccount tedAcc = new BankAccount("Ted", "92826", 57000);
        BankAccount markAcc = new BankAccount("Mark", "94837", 57000);
        BankAccount kymAcc = new BankAccount("Kym", "93827", 57000);


        zechAcc.deposit(80);

        jakeAcc.withdraw(50);

        System.out.println(jakeAcc);

        }

    }

