package com.company.logic;

public class BankAccount {

    public Bank bank;
    public Person owner;
    public String uid;
    public int balance;

    public BankAccount (Person person, Bank bank, String uid) {
        this.owner = person;
        this.bank = bank;
        this.uid = uid;
        this.balance = 0;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (this.balance - amount < 0) {
            this.balance -= amount;
        }
    }

    public Person getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public String getUID() {
        return uid;
    }

}
