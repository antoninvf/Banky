package com.company.presentation;

import com.company.logic.Bank;
import com.company.logic.BankAccount;
import com.company.logic.Person;

import java.util.Scanner;

public class BankUI {

    private Bank bank1 = new Bank("FireBank", "firebank");
    private Bank bank2 = new Bank("Horizon", "horizon");

    private Person person1 = new Person("Class", "Room", 26, 173);
    private Person person2 = new Person("Meet", "Man", 18, 420);

    private Scanner sc;

    public void init() {
        sc = new Scanner(System.in);
        bank1.openNewBacc(person1, bank1);
        bank2.openNewBacc(person1, bank2);
        bank1.openNewBacc(person2, bank1);
        bank2.openNewBacc(person2, bank2);
    }

    public void mainMenu() {
        System.out.println();
        System.out.println("Welcome to the demo of the most \"secure\" banking software ever.");
        System.out.println();
        System.out.println("What do you want to see?");
        System.out.println("> 1) Depositing money to a bank account");
        System.out.println("> 2) Withdrawing money from a bank account");
        System.out.println("> 3) Sending someone money");
        System.out.println("> 4) Check balance");
        System.out.println("> 5) Exit");
        System.out.println();
        String input1 = sc.nextLine();
        if(input1.equals("1")) {
            System.out.println("You have picked \"1) Depositing money to a bank account\"");
            depositMoney();
        }
        else if(input1.equals("2")) {
            System.out.println("You have picked \"3) Withdrawing money from a bank account\"");
            withdrawMoney();
        }
        else if(input1.equals("3")) {
            System.out.println("You have picked \"3) Sending someone money\"");
            sendMoney();
        }
        else if(input1.equals("4")) {
            System.out.println("You have picked \"4) Check balance\"");
            checkBalance();
        }
        else if(input1.equals("5")) {
            System.out.println("Goodbye!");
            System.exit(0);
        }
        else {
            System.out.println("Invalid input");
            mainMenu();
        }
    }

    public void depositMoney() {
        Bank bankPicked = new Bank("", "");
        Person currentPerson = new Person("", "", 0, 0);
        System.out.println("Who do you want to pick?");
        System.out.println("1) " + person1.getFName() + " " + person1.getLName());
        System.out.println("2) " + person2.getFName() + " " + person2.getLName());
        String input2 = sc.nextLine();
        if(input2.equals("1")) {
            currentPerson = person1;
        }
        else if(input2.equals("2")) {
            currentPerson = person2;
        }
        else {
            currentPerson = new Person("", "", 0, 0);
            System.out.println("Invalid Input");
            mainMenu();
        }
        System.out.println("You picked " + currentPerson.getFName() + " " + currentPerson.getLName());
        System.out.println("How much do you want to deposit?");
        String inputamount = sc.nextLine();
        int parsedAmount = Integer.parseInt(inputamount);
        System.out.println("What bank do you want to deposit to?");
        System.out.println("1) " + bank1.name);
        System.out.println("2) " + bank2.name);
        String input3 = sc.nextLine();
        if(input3.equals("1")) {
            bankPicked = bank1;
        }
        else if(input3.equals("2")) {
            bankPicked = bank2;
        } else {
            currentPerson = new Person("", "", 0, 0);
            System.out.println("Invalid Input");
            mainMenu();
        }
        bankPicked.getBacc(currentPerson).deposit(parsedAmount);
        mainMenu();
    }

    public void withdrawMoney() {
        Bank bankPicked = new Bank("", "");
        Person currentPerson = new Person("", "", 0, 0);
        System.out.println("Who do you want to pick?");
        System.out.println("1) " + person1.getFName() + " " + person1.getLName());
        System.out.println("2) " + person2.getFName() + " " + person2.getLName());
        String input2 = sc.nextLine();
        if(input2.equals("1")) {
            currentPerson = person1;
        }
        else if(input2.equals("2")) {
            currentPerson = person2;
        }
        else {
            currentPerson = new Person("", "", 0, 0);
            System.out.println("Invalid Input");
            mainMenu();
        }
        System.out.println("You picked " + currentPerson.getFName() + " " + currentPerson.getLName());
        System.out.println("How much do you want to withdraw?");
        String inputamount = sc.nextLine();
        int parsedAmount = Integer.parseInt(inputamount);
        System.out.println("What bank do you want to withdraw from?");
        System.out.println("1) " + bank1.name);
        System.out.println("2) " + bank2.name);
        String input3 = sc.nextLine();
        if(input3.equals("1")) {
            bankPicked = bank1;
        }
        else if(input3.equals("2")) {
            bankPicked = bank2;
        } else {
            currentPerson = new Person("", "", 0, 0);
            System.out.println("Invalid Input");
            mainMenu();
        }

        if(bankPicked.getBacc(currentPerson).canWithdraw(parsedAmount)) {
            bankPicked.getBacc(currentPerson).withdraw(parsedAmount);
            System.out.println("You withdrew " + parsedAmount + " cash money. You now have: " + bankPicked.getBacc(currentPerson).getBalance());
        }
        else {
            System.out.println("You are too poor to do this transaction");
            mainMenu();
        }

        mainMenu();
    }

    public void sendMoney() {
        Bank bankPicked = new Bank("", "");
        Person currentPerson = new Person("", "", 0, 0);
        Person sentPerson = new Person("", "", 0, 0);
        System.out.println("Who do you want to pick?");
        System.out.println("1) " + person1.getFName() + " " + person1.getLName());
        System.out.println("2) " + person2.getFName() + " " + person2.getLName());
        String input2 = sc.nextLine();
        if(input2.equals("1")) {
            currentPerson = person1;
        }
        else if(input2.equals("2")) {
            currentPerson = person2;
        }
        else {
            currentPerson = new Person("", "", 0, 0);
            System.out.println("Invalid Input");
            mainMenu();
        }
        System.out.println("You picked " + currentPerson.getFName() + " " + currentPerson.getLName());
        System.out.println("How much do you want to send?");
        String inputamount = sc.nextLine();
        int parsedAmount = Integer.parseInt(inputamount);
        System.out.println("What bank do you want to send from?");
        if(input2.equals("1")) {
            bankPicked = bank1;
        }
        else if(input2.equals("2")) {
            bankPicked = bank2;
        }
        System.out.println("Who do you want to send money to?");
        System.out.println("1) " + person1.getFName() + " " + person1.getLName());
        System.out.println("2) " + person2.getFName() + " " + person2.getLName());
        String input3 = sc.nextLine();
        if(input3.equals("1")) {
            sentPerson = person1;
        }
        else if(input3.equals("2")) {
            sentPerson = person2;
        }

        BankAccount bacSender = bankPicked.getBacc(currentPerson);
        BankAccount bacReceiver = bankPicked.getBacc(sentPerson);
        if(bankPicked.getBacc(currentPerson).canWithdraw(parsedAmount)) {
            bankPicked.getBacc(currentPerson).withdraw(parsedAmount);
            bankPicked.getBacc(sentPerson).sendMoney(parsedAmount);
            System.out.println("You sent " + parsedAmount + " cash money. You now have: " + bankPicked.getBacc(currentPerson).getBalance());
            System.out.println("Your balance is " + bacSender.getBalance());
            System.out.println(sentPerson.getFName() + "'s balance is " + bacReceiver.getBalance());
            mainMenu();
        }
        else {
            System.out.println("You are too poor to do this transaction");
            mainMenu();
        }
    }

    public void checkBalance() {
        System.out.println(person1.getFName() + "'s " + bank1.getName() + " balance is " + bank1.getBacc(person1).getBalance());
        System.out.println(person1.getFName() + "'s " + bank2.getName() + " balance is " + bank2.getBacc(person1).getBalance());
        System.out.println(person2.getFName() + "'s " + bank1.getName() + " balance is " + bank1.getBacc(person2).getBalance());
        System.out.println(person2.getFName() + "'s " + bank2.getName() + " balance is " + bank2.getBacc(person2).getBalance());
        mainMenu();
    }
}
