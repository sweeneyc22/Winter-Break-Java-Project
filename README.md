# Winter-Break-Java-Project
Small project with the objective of keeping your OOP skills sharp over the winter break.

Program Outline: Investing for the Future.

Intro

This program outline is designed to keep your skills sharp for OOP languages. In this case, we will be using Java. One of the most common first languages taught in college. In this program you will have to create several classes, a driver program, and implementation of several JUNIT instances. This program will have you create the following:

· A driver (main)

· A Bank Class

· A Stock Class

· JUNIT cases for all the classes above (not the main)

Name: _Colby_Sweeney_ Project Due Date: 1/8/2021

1.1 The Banking Class

In this portion of the project, you will be creating the banking class. This MUST be a separate class from the main.

1.2

This class must contain the following variables: A bank name, a randomly generated bank account number, a bank account name, a bank account balance, the ability to withdrawal and deposit money into the bank account.

1.3

The Bank class must contain several methods(functions). For simplicity in reading, I have listed what the methods will do

· Get Bank Name

· Get Bank account Number

· Get bank account name

· Get bank account balance

· Set Bank account name

· Set Bank account balance

· Get Broker Fee

· Set account balance

· Set name

2.1 The Stock Class

In this class, you will create a stock. This stock has a certain number of shares available (no greater than 100). Each share has a certain value. You will be able to buy shares in the stock using money from your investment account. This stock will fluctuate in price using a loop. Randomly, it can go up or down based on the loop.

2.2

The variables for this stock will need to be a stock name, the number of shares, the price per share, how many shares you own, the total amount of money you have invested in the stock.

2.3

The methods(functions) for this stock will include:

· A get name

· A get share #

· A get share $

· Get share amount

· Get share amount owned

· Get invested amount

· Set share invest amount

· Get projected profit

2.4 OPTIONAL BONUS

Using the Java print formatting and a loop, create a chart that shows the previous history of the stock before you choose to invest. Then, when you invest

and the program is complete, use the same chart to print the share price fluctuation again and showing your complete value.

4.1 Junit Test Cases

In this section you will create a test class corresponding to every class that you have. You will test all of the methods inside of them using various instances. Make sure you have default constructors that fulfill any instance of missing information. Build your program piece-by-piece using your test cases to make sure everything works properly. You should not save this for the end! Build your test cases along side your classes!

5.1 The Getaway Driver

In the main, things may get a little complicated here. There is a lot of moving parts. This driver class will need to call all of the classes listed above. You are responsible for giving the bank, and the stocks their names, but you will need to have the user set their own name for BOTH the bank account and the investment account. Their name should be the same, so it should take the input one time and set it to both of the classes. Next you should show the User the current amount in their bank account this should be preset. Next you will show them up to three different types of stocks, where they have the choice to invest in the stock or not using yes or no. This will show the stock information such as name, price per share, and the number of shares available. If the user chooses yes to invest in the stock, then they must be prompted with how many shares they would like to buy. After inputting the number, show them how much it will cost to buy that many shares, confirm this is what they want, and show them how much they will be actually investing after broker fees then, move to the next stock until the user has been shown all of the stocks (remember at least three stocks). After the user has invested in the stocks, you will want the stocks to function how they do in real life, have the stocks fluctuate in price and print their final end-of-day value. This value will show how much the user initially started with, how much they have now BASED on the new price per share. Then the program will automatically sell the shares back, depositing the new amount into their bank account.

5.2

You will need to summarize all the information above at the end of the program in a neat orderly fashion. To do so, you will need to use Java’s print formatting.

Below is an example of what the output should look like:

***************************************************

Bank Name:

Bank Account Name:

Account Number:

Account Balance:

****************************************************

Investments:

Stock 1:

Stock Name:

Shares held:

Buy price:

Sell Price:

Net profit/loss:

Broker Fee %:

Broker Fee Total:

Stock 2 . . . (repeat above until all stocks displayed)

Net Combined Profit/loss:

****************************************************
