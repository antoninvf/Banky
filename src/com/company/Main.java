package com.company;

import com.company.presentation.BankUI;

public class Main {
    public static void main(String[] args) {
        BankUI ui = new BankUI();
        ui.init();
        ui.mainMenu();
    }
}
