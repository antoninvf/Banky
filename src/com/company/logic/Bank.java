package com.company.logic;

import java.util.ArrayList;
import java.util.Random;

public class Bank {

    public String name;
    public String shortname;
    public ArrayList<BankAccount> baccs;
    public ArrayList<String> uidList;

    public Bank(String name, String shortname) {
        this.name = name;
        this.shortname = shortname;
        this.baccs = new ArrayList<>();
    }

    public void openNewBacc(Person person, Bank bank) {
        baccs.add(new BankAccount(person, bank, uid(person)));
    }

    public ArrayList<BankAccount> viewBaccs(Person person) {
        return this.baccs;
    }

    public void deleteBacc(Person person) {
        baccs.remove(getBacc(person));
    }

    private String uid(Person p) {
        Random rng = new Random();
        int random = rng.nextInt(999999);
        String uid = (name + random + "-" + p.getFName() + "-" + p.getLName() + "-" + p.favNumber);
        return uid;
    }

    public BankAccount getBacc(Person person) {
        for (int i = 0; i < baccs.size(); i++) {
            Person p = baccs.get(i).getOwner();
            if(p.getFName().equals(person.getFName()) && p.getLName().equals(person.getLName())) {
                return baccs.get(i);
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    public String getShortname() {
        return this.shortname;
    }

}
