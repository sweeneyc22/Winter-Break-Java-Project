package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        Bank Bank = new Bank();
        Bank.bankName = "Sweeney Banks";

        System.out.println("Welcome to Sweeney banking! What is your first name?");
        Bank.accountName = input.next();
        Bank.setAccountBalance(0);
        System.out.println("Welcome " + Bank.accountName + " ... Generating your account ID");


        int max = 1000;
        int min = 1;
        int range = max - min + 1;
        Bank.accountNumber = (int) (Math.random() * range) + min;
        System.out.println("Your account number is: " + Bank.accountNumber);

        Bank.displayInfo();

        if (Bank.accountBalance == null || Bank.accountBalance == 0) {
            System.out.println("Your account does not have a balance, would you like to make a deposit?\n"
                    + "1: Yes\n" + "2: No");
            int answer = input.nextInt();
            switch (answer) {
                case 1:

                    System.out.println("Enter the amount you would like to deposit");
                    double deposit = input.nextDouble();
                    System.out.println("You entered: " + deposit + " ... is this correct? 1: Yes 2: No");
                    answer = input.nextInt();
                    if (answer == 2) {
                        System.out.println("Enter the amount you would like to deposit");
                        deposit = input.nextDouble();
                        System.out.println("You have made a deposit of $" + deposit);
                        Bank.deposit(deposit);
                        Bank.displayInfoMenu();
                        break;
                    }
                    Bank.deposit(deposit);
                    System.out.println("You have made a deposit of $" + deposit);
                case 2:
                    Bank.displayInfoMenu();
                    break;
            }
        }

        int choice = input.nextInt();
        while (choice != 0) {
            Bank.displayInfoMenu();
        }

    }


}
