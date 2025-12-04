/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_3;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
2. Accept any number from the user. Using switch case, write a menu driven program to
perform any of the following operations :

1] Display the square of the number
2] Display the cube of the number
3] Check if the number is even or odd
4] Increment operation
5] Decrement operation

 */
public class B3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Select an operation:");
        System.out.println("1. Display the square of the number");
        System.out.println("2. Display the cube of the number");
        System.out.println("3. Check if the number is even or odd");
        System.out.println("4. Increment operation");
        System.out.println("5. Decrement operation");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Square of the number: " + (number * number));
                break;
            case 2:
                System.out.println("Cube of the number: " + (number * number * number));
                break;
            case 3:
                if (number % 2 == 0) {
                    System.out.println("The number is even.");
                } else {
                    System.out.println("The number is odd.");
                }
                break;
            case 4:
                System.out.println("Incremented number: " + (++number));
                break;
            case 5:
                System.out.println("Decremented number: " + (--number));
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
                break;
        }
        // TODO code application logic here
    }

}
