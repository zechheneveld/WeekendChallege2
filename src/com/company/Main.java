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


        BankAccount[] listofAccounts = {zechAcc, jakeAcc, joanAcc,
                                        scottAcc, loriAcc, mannyAcc,
                                        markAcc, koddyAcc, tedAcc, kymAcc};


        for (int i = 0; i < listofAccounts.length; i++) {
            listofAccounts[i].deposit(57000);
            System.out.println(listofAccounts[i].name + " has " + listofAccounts[i].balance);

        }

        for (BankAccount specificAccount : listofAccounts){

            System.out.println(specificAccount.name + " received 200 as a bonus:");
            specificAccount.deposit(500);
            System.out.println(specificAccount.name + "'s new balance is: " + specificAccount.balance);
        }

        System.out.println("Withdraw 500 from Zech's account");
        listofAccounts[0].withdraw(500);
        System.out.println(listofAccounts[0].name + "'s new balance is: " + listofAccounts[0].balance);
        }

    }

