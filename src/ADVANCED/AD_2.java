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
2.Allow the user to withdraw some amount from the account, only if the account balance is
greater than 0 and if the withdrawal amount is less than the account balance. Display the
final balance in the account after the transaction.

Expected Input:
Enter AccountNo: 111
Enter the amount you wish to withdraw: 30000

Expected Output:
Sorry! You don’t have a sufficient balance in your account.

Expected Input:
Enter AccountNo: 111
Enter the amount you wish to withdraw: 10000

Expected Output:
Transaction Successful!
AccountNo: 111
Final balance: 10000
 */
public class AD_2 {
    private int accountNo;
    private double balance;

    public AD_2(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
    
    public void withdraw(double amount){
        if(balance > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Transaction successfull");
            System.out.println("AccountNo: " + accountNo);
            System.out.println("Final balance: " + balance);
        }else{
            System.out.println("Sorry! You don’t have a sufficient balance in your account.");
        }
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
        System.out.print("Enter Account No: ");
        int accountNo = sc.nextInt();
        
        System.out.print("Enter the amount you wish to withdraw: ");
        double amount = sc.nextDouble();
        
        AD_2 ad1 = new AD_2(accountNo,10000);// Assuming initial balance is 10000
        ad1.withdraw(amount);
     
     
        // TODO code application logic here
    }

}
