package com.company.logic;

import java.util.ArrayList;

public class Person {

    public String firstName;
    public String lastName;
    public int age;
    public int favNumber; // idfk lmao

    public Person(String fname, String lname, int age, int fnum) {
        this.firstName = fname;
        this.lastName = lname;
        this.age = age;
        this.favNumber = fnum;
    }

    public void createBacc(Bank bank) {
        bank.openNewBacc(this, bank);
    }

    public void closeBacc(Bank bank) {
        bank.deleteBacc(this);
    }

    public void deposit(BankAccount bacc, int amount) {
        bacc.deposit(amount);
    }

    public void withdraw(BankAccount bacc, int amount) { // biggest troll of the century
        bacc.withdraw(amount);
    }

    // GET
    public Person getPerson() {
        return this;
    }

    public String getFName() {
        return this.firstName;
    }

    public String getLName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public int getFNumber() {
        return this.favNumber;
    }

}
