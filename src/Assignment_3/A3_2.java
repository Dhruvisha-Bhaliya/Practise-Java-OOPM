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
2. Accept the value for two numbers from the user. Provide menu options for all 5 basic
arithmetic operations. Perform only the selected operation on those numbers.

Example : Enter ‘+’ for addition.
Enter ‘-’ for subtraction.
Enter ‘*’ for multiplication.
Enter ‘/’ for division.
Enter ‘%’ for modulo.
 */
public class A3_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int a = sc.nextInt();
        System.out.print("ENter number2: ");
        int b = sc.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("subtraction: " + (a - b));
        System.out.println("multiplication: " + (a * b));
        System.out.println("division: " + (a / b));
        System.out.println("modulo: " + (a % b));

        // TODO code application logic here
    }

}
