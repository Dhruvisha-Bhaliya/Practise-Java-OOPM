/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOPMAssign_5;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
PART 2
Aim : Implementing Hierarchical Inheritance
Create following classes and relationships with their respective data members.

1. Create objects of Savings A/c and Current A/c.
2. Deposit Rs 5000 in Savings A/c.
3. Deposit Rs 10000 in Current A/c.
4. Find Monthly interest received based on Interest rate 10% on Savings A/c.
5. Find Monthly interest received based on Interest rate 15% on Current A/c.
6. Withdraw from Savings A/c (the amount taken from the user). Do not allow withdrawal if
account balance is less than Rs. 1000.
7. Withdraw from Current A/c (the amount taken from the user). Do not allow withdrawal if
account balance is less than Rs. 10000.
 */
class BankAccount {

    protected String aid;
    protected String aname;
    protected double balance;

    public BankAccount(String aid, String aname, double balance) {
        this.aid = aid;
        this.aname = aname;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void showBalance() {
        System.out.println("Account ID: " + aid);
        System.out.println("Account name: " + aname);
        System.out.println("Balance: Rs " + balance);
    }
}

class Savings extends BankAccount {

    protected float interest_rate;

    public Savings(String aid, String aname, double balance, float interest_rate) {
        super(aid, aname, balance);
        this.interest_rate = interest_rate;
    }

    public double calculateMonthlyInterest() {
        return balance * (interest_rate / 1200);
    }

}

class Current extends BankAccount {

    protected float interest_charge;

    public Current(String aid, String aname, double balance, float interest_charge) {
        super(aid, aname, balance);
        this.interest_charge = interest_charge;
    }

    public double calaculateMonthlyInterest() {
        return balance * (interest_charge / 1200);
    }

}

public class OA5_P_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Create objects of Savings A/c and current A/c
        Savings savingAccount = new Savings("S001", "John Doe", 0, 10);
        Current currentAccount = new Current("C001", "Jane Smith", 0, 15);

        savingAccount.deposit(5000);
        currentAccount.deposit(10000);

        System.out.println("After deposits: ");
        savingAccount.showBalance();
        currentAccount.showBalance();

        double savingMonthlyInterest = savingAccount.calculateMonthlyInterest();
        System.out.println("Monthly interest for Savings A/c: " + savingMonthlyInterest);

        double currentMonthlyInterest = currentAccount.calaculateMonthlyInterest();
        System.out.println("Monthly interest for Current A/c: " + currentMonthlyInterest);

        System.out.println("Enter withdrawal amount for Savings A/c: ");
        double savingwithdrawalAmount = sc.nextDouble();

        if (savingAccount.withdraw(savingwithdrawalAmount)) {
            System.out.println("Withdrawal successful for Savings A/c.");
        } else {
            System.out.println("Insufficient balance for Savings A/c.");
        }

        System.out.println("Enter withdrawal amount for Current A/c: ");
        double currentwithdrawalAmount = sc.nextDouble();

        if (currentAccount.withdraw(currentwithdrawalAmount)) {
            System.out.println("withdrawal successful for Current A/c.");
        } else {
            System.out.println("Insufficient balance for Current A/c.");
        }

        System.out.println("After withdrawals: ");
        savingAccount.showBalance();
        currentAccount.showBalance();
        // TODO code application logic here
    }

}
