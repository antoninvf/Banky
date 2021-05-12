package com.company.logic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DataManager {

    // unfinished idk why i even did this

    public void savePerson(Person person) {
        String filename = (person.getFName() + person.getLName() + person.getFNumber() + person.getAge());
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("data/person/" + filename + ".txt"));
            bw.write(person.getFName() + "");
            bw.newLine();
            bw.write(person.getLName() + "");
            bw.newLine();
            bw.write(person.getAge() + "");
            bw.newLine();
            bw.write(person.getFNumber() + "");
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void saveBank(Bank bank) {
        String filename = (bank.shortname + "/" + bank.shortname);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("data/bank/" + filename + ".txt"));
            bw.write(bank.getName() + "");
            bw.newLine();
            bw.write(bank.getShortname() + "");
            bw.close();
            saveBACCSlist(bank);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private void saveBACCSlist(Bank bank) {
        for (int i = 0; i < bank.baccs.size(); i++) {
            String uid = bank.baccs.get(i).getUID();
            String filename = (bank.shortname + "/baccs/" + uid);
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("data/bank/" + filename + ".txt"));
                bw.write(bank.getName() + "");
                bw.newLine();
                bw.write(bank.getShortname() + "");
                bw.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

}
