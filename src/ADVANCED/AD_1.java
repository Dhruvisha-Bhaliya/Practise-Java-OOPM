/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ADVANCED;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*

ADVANCED 

1.Allow the user to deposit some amount in the account. Display the reflected balance in the
account after the transaction.

Expected Input:
Enter AccountNo: 111
Enter the amount you wish to deposit: 10000

Expected Output:
Transaction Successful!
AccountNo: 111
Final balance: 30000
 */
class Account {

    int accountNo;
    double balance;

    public Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void displaybalanace() {
        System.out.println("Transaction successfull");
        System.out.println("AccountNo : " + accountNo);
        System.out.println("Final balance: " + balance);
    }
}

public class AD_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account No : ");
        int accountNo = sc.nextInt();

        System.out.println("Enter balance: ");
        double balance = sc.nextDouble();

        Account a1 = new Account(accountNo, 20000);// Assuming initial balance is 20000
        a1.deposit(balance);
        a1.displaybalanace();

        // TODO code application logic here
    }

}
