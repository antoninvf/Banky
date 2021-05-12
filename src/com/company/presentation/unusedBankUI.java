/*package com.company.presentation;

import com.company.logic.Bank;
import com.company.logic.BankAccount;
import com.company.logic.DataManager;
import com.company.logic.Person;

import java.util.Scanner;

public class unusedBankUI {

    private Bank bank1 = new Bank("FireBank", "firebank");
    private Bank bank2 = new Bank("Horizon", "horizon");
    private Bank bank3 = new Bank("Give us money bank", "gumb");

    private Scanner sc;
    private DataManager dm;

    public void init() {
        sc = new Scanner(System.in);
        dm = new DataManager();
    }

    public void mainMenu() {
        System.out.println();
        System.out.println("Welcome to the most \"secure\" banking software ever.");
        System.out.println();
        System.out.println("What do you want to do?");
        System.out.println("> 1) Open a bank account");
        System.out.println("> 2) Close a bank account");
        System.out.println("> 3) View bank accounts");
        System.out.println("> 4) Deposit money to a bank account");
        System.out.println("> 5) Send someone money");
        System.out.println();
        String input1 = sc.nextLine();
        if(input1.equals("1")) {
            openAccMenu();
        }
        else if(input1.equals("2")) {
            closeAccMenu();
        }
        else if(input1.equals("3")) {
            viewAccMenu();
        }
        else if(input1.equals("4")) {
            depositMoneyMenu();
        }
        else if(input1.equals("5")) {
            sendMoneyMenu();
        }
        else {
            System.out.println("Invalid input");
            mainMenu();
        }
    }

    public void openAccMenu() {
        Bank pickedBank = new Bank("", "");
        System.out.println("You have picked \"1) Open an Account\"");
        System.out.println();
        System.out.println("What bank do you want to pick");
        System.out.println("1) " + bank1.name);
        System.out.println("2) " + bank2.name);
        System.out.println("3) " + bank3.name);
        System.out.println();
        String input2 = sc.nextLine();
        if(input2.equals("1")) {
            pickedBank = bank1;
        }
        else if(input2.equals("2")) {
            pickedBank = bank2;
        }
        else if(input2.equals("3")) {
            pickedBank = bank3;
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

        int parsedAge = Integer.parseInt(age);
        int parsedFNum = Integer.parseInt(favNum);
        Person createdPerson = new Person(fname, lname, parsedAge, parsedFNum, pickedBank.getShortname());
        createdPerson.createBacc(pickedBank);
        dm.savePerson(createdPerson);
        dm.saveBank(pickedBank);

        mainMenu();
    }

    public void closeAccMenu() {
        Bank pickedBank = new Bank("", "");
        BankAccount pickedBankAccount = new BankAccount(null, null, "");
        Person currentPerson = new Person("", "", 0, 0, "");
        System.out.println("You have picked \"2) Close an Account\"");
        System.out.println("Let's get to it.. We will ask you for some of your information so we can close the account.");
        System.out.println();
        System.out.println("What is your first name?");
        String fname = sc.nextLine().toLowerCase();
        System.out.println("What is your last name?");
        String lname = sc.nextLine().toLowerCase();
        System.out.println("What is your favorite number? (The one you were supposed to remember.)");
        String favNum = sc.nextLine();




    }

    public void viewAccMenu() {
        Person currentPerson = new Person("", "", 0, 0, "");
        System.out.println("You have picked \"3) View bank accounts\"");
        System.out.println("What is your first name?");
        String fname = sc.nextLine().toLowerCase();
        System.out.println("What is your last name?");
        String lname = sc.nextLine().toLowerCase();
        System.out.println("What is your favorite number? (The one you were supposed to remember.)");
        String favNum = sc.nextLine();

        for (int i = 0; i < ; i++) {

        }
    }

    public void depositMoneyMenu() {

    }

    public void sendMoneyMenu() {

    }
}
*/