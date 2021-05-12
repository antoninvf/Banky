package com.company.presentation;

import com.company.logic.Bank;
import com.company.logic.BankAccount;
import com.company.logic.Person;

import java.util.Scanner;

public class BankUI {

    private Bank bank1 = new Bank("FireBank", "firebank");
    private Bank bank2 = new Bank("Horizon", "horizon");

    private Person person1 = new Person("Class","Room",26,173);
    private Person person2 = new Person("Meet","Man",18,420);

    private Scanner sc;

    public void init() {
        sc = new Scanner(System.in);
    }

    public void mainMenu() {
        System.out.println();
        System.out.println("Welcome to the demo of the most \"secure\" banking software ever.");
        System.out.println();
        System.out.println("What do you want to see?");
        System.out.println("> 1) Opening a bank account");
        System.out.println("> 2) Closing a bank account");
        System.out.println("> 3) Depositing money to a bank account");
        System.out.println("> 4) Sending someone money");
        System.out.println();
        String input1 = sc.nextLine();
        if(input1.equals("1")) {
            System.out.println("You have picked \"1) Opening a bank account\"");
            openAccMenu();
        }
        else if(input1.equals("2")) {
            System.out.println("You have picked \"2) Closing a bank account\"");
            closeAccMenu();
        }
        else if(input1.equals("3")) {
            System.out.println("You have picked \"3) Depositing money to a bank account\"");
            depositMoneyMenu();
        }
        else if(input1.equals("4")) {
            System.out.println("You have picked \"4) Sending someone money\"");
            sendMoneyMenu();
        }
        else {
            System.out.println("Invalid input");
            mainMenu();
        }
    }

    public void openAccMenu() {
        Bank pickedBank = new Bank("", "");
        System.out.println("This is the creation process you would go through");
        System.out.println();
        System.out.println("What bank do you want to pick");
        System.out.println("1) " + bank1.name);
        System.out.println("2) " + bank2.name);
        System.out.println();
        String input2 = sc.nextLine();
        if(input2.equals("1")) {
            pickedBank = bank1;
        }
        else if(input2.equals("2")) {
            pickedBank = bank2;
        }
        else {
            System.out.println("Invalid input");
            openAccMenu();
        }
        System.out.println("You have picked " + pickedBank.name);
        System.out.println("We will now ask for some of your information so we can make the Bank account.");
        System.out.println();
        System.out.println("What is your first name?");
        String fname = sc.nextLine();
        System.out.println("What is your last name?");
        String lname = sc.nextLine();
        System.out.println("How old are you? (Age)?");
        String age = sc.nextLine();
        System.out.println("What is your favorite number? (You will need this number if you want to ever close your account.)");
        String favNum = sc.nextLine();
        System.out.println();
        System.out.println("Great! We have created your Bank Account.");
        System.out.println("This is the information of it:");
        System.out.println("First name: " + fname + "\nLast name: " + lname + "\nAge: " + age + "\nFavorite Number: " + favNum);
        System.out.println();
        mainMenu();
    }

    public void closeAccMenu() {
        Person currentPerson = new Person("", "", 0, 0);
        System.out.println("Who do you want to pick?");
        System.out.println("1) "+person1.getFName()+" "+person1.getLName());
        System.out.println("2) "+person2.getFName()+" "+person2.getLName());
        System.out.println("What is your favorite number?");
        System.out.println("Your favourite number is " + currentPerson.getFNumber());
        String favNum = sc.nextLine();
        int parsedFnum = Integer.parseInt(favNum);

        currentPerson.closeBacc(bank1);


    }

    public void depositMoneyMenu() {

    }

    public void withdrawMoneyMenu() {

    }

    public void sendMoneyMenu() {

    }
}
