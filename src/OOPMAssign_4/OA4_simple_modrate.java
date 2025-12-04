/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOPMAssign_4;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
SIMPLE
Implement OOP in java using the following information.

Create the class called “Customer” as follows with given accessibility for its members:
(NOTE: + indicates Protected, * indicates Public, ++ indicates private)
Class: Customer
Data member:
+ Name
+ Age
+ Contact
Note: Create a constructor to initialize the data members
Member functions:
* getCustomers()
* showCustomers()

MODERATE
Extend the above program to add the following functionalities:

1) Create a class account “Account ” which will inherit the customer class.
(Use the keyword extends for inheritance.)

2) Input and display user details like name, age, contact, accno, and bal for n
customers. Implement an array of objects.
[HINT: Create object of child class only.]
Expected Input:
Welcome! Enter following details:
Name: Peter Andrews
Age: 30
Contact Number: 4478962586
AccountNo: 111
Balance: 20000
(Repeat taking input for details of n customers)
Expected Output:
Name Age Contact Number Account Number Balance
_________________________________________________________________
Peter Andrews 30 4478962586 111 20000
Emma Stone 30 3456345675 222 30000
(Show details of n customers )
*/


class Customer{
   protected String Name;
   protected int age;
   protected String contact;

    public Customer(String Name, int age, String contact) {
        this.Name = Name;
        this.age = age;
        this.contact = contact;
    }
   
   public void getcustomer(){
       
   }
   
   public void showcustomer(){
       System.out.println("Name: "+Name);
       System.out.println("age: "+age);
       System.out.println("contact: "+contact);
   }
}


class Account extends Customer {
        protected int Accno;
        protected double bal;

    public Account(String Name, int age, String contact,int Accno, double bal) {
        super(Name, age, contact);
        this.Accno = Accno;
        this.bal = bal;
    }
        
        public void deposit(){
            
        }
        
        public void withdraw(){
            
        }
        
        public void transfer(){
            
        }
        
        public void showCustomer(){
            super.showcustomer();
            System.out.println("AccountNo: "+Accno);
            System.out.println("Balance: "+bal);
        }
}

public class OA4_simple_modrate {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of customers: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Account[] customers = new Account[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for customer " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("Contact Number: ");
            String contact = scanner.nextLine();
            System.out.print("Account Number: ");
            int accno = scanner.nextInt();
            System.out.print("Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            customers[i] = new Account(name, age, contact, accno, balance);
        }

        System.out.println("\nCustomer Details:");
        System.out.println("Name\tAge\tContact Number\tAccount Number\tBalance");
        System.out.println("-----------------------------------------------------------");

        for (Account customer : customers) {
            System.out.println(customer.Name + "\t" + customer.age + "\t" + customer.contact + "\t" + customer.Accno + "\t" + customer.bal);
        }
//        Customer c1 = new Customer("John doe",21,"123456");
//        c1.getcustomer();
//        c1.showcustomer();
        // TODO code application logic here
    }
}

 
