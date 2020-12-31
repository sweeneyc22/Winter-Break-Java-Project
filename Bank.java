package com.company;

import java.util.Scanner;

public class Bank {
    public String bankName;
    public String accountName;
    public Integer accountNumber;
    public Double brokerFee;
    public Double accountBalance;
    Scanner input = new Scanner(System.in);

    // Getters
    String getBankName() {
        return bankName;
    }

    void setBankName(String newName) {
        this.bankName = newName;
    }

    Integer getAccountNumber() {
        return accountNumber;
    }

    String getAccountName() {
        return accountName;
    }

    void setAccountName(String newName) {
        this.accountName = newName;
    }

    // Setters

    double getAccountBalance() {
        return accountBalance;
    }

    void setAccountBalance(double newBalance) {
        this.accountBalance = newBalance;
    }

    double getBrokerFee() {
        return brokerFee;
    }


    // Bank Functions

    void displayInfoMenu() {
        System.out.println("****************************************************");
        System.out.println("Bank Name: " + this.bankName);
        System.out.println("Bank Account Name: " + this.accountName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Balance: " + this.accountBalance);
        System.out.println("****************************************************");

        System.out.println("1: Deposit");
        System.out.println("2: Withdraw");
        System.out.println("3: Investments");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter amount to deposit");
                double deposit = input.nextDouble();

                System.out.println("You chose: $" + deposit + " ... is this correct?");
                int answer = input.nextInt();
                if (answer == 1) {
                    deposit(deposit);
                    System.out.println("You made a deposit of: $" + deposit);
                    displayInfoMenu();
                } else {
                    System.out.println("Enter amount to deposit");
                    deposit = input.nextDouble();
                    displayInfoMenu();
                }
            case 2:
                System.out.println("Enter amount to withdraw");
                double withdrawAmount = input.nextDouble();

                System.out.println("You chose: " + withdrawAmount + " ... is this correct?");
                answer = input.nextInt();
                if (answer == 1) {
                    if (this.accountBalance - withdrawAmount > 0) {
                        System.out.println("You withdrew $" + withdrawAmount);
                        withdraw(withdrawAmount);
                        displayInfoMenu();
                    }
                } else {
                    System.out.println("Enter amount to withdraw");
                    withdrawAmount = input.nextDouble();
                    if (this.accountBalance - withdrawAmount < 0) {
                        withdraw(withdrawAmount);
                        displayInfoMenu();
                    }
                }
            case 3:
        }
    }

    void withdraw(double withdraw) {
        accountBalance = (accountBalance - withdraw);
    }

    void deposit(double deposit) {
        this.accountBalance += deposit;
    }

    public void displayInfo() {
        System.out.println("****************************************************");
        System.out.println("Bank Name: " + this.bankName);
        System.out.println("Bank Account Name: " + this.accountName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Balance: " + this.accountBalance);
        System.out.println("****************************************************");
    }
}
