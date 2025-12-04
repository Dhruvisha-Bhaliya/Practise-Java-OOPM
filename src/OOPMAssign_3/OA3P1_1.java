/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOPMAssign_3;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
PART 1

1. Write a program in Java to accept two numbers from the user. Raise the
ArithmeticException when the user tries to divide num1 by num2, and num2 is zero.
 */
public class OA3P1_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter first number: ");
            int number1 = sc.nextInt();

            System.out.println("Enter second number: ");
            int number2 = sc.nextInt();

            int result = number1 / number2;
            System.out.println("The result is : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error : Division by zero is not allowed");
        }
        // TODO code application logic here
    }

}
