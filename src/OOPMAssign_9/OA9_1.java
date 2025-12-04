/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOPMAssign_9;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
Implementing different types of nested classes

QUESTION 1:

BASIC:

Suppose you’re designing a Calculator.

A. Create a class Calculator which contains two static numbers.

B. Create a static nested class called Basic within Calculator which contains methods for
basic calculation.

Include methods within Basic like add(), subtract(), multiply(), and so on.

C. Ask the user which arithmetic operation he wants to perform, and display the results
accordingly.

MODERATE:
A. Create another static nested class called Scientific within Calculator, which contains a
method power() to calculate n1^n2.
 */

public class OA9_1 {  //calculator name of class
    
 private static int num1 = 10;
    private static int num2 = 5;

    static class Basic {

        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

        public static double divide(int a, int b) {
            if (b != 0) {
                return (double) a / b;
            } else {
                System.out.println("Cannot divide by zero.");
                return Double.NaN;
            }
        }
    }
    
    static class Scientific {

    public static double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an operation: add,subtract,multiply,divide,power");
        String operation = sc.next();
        
        switch(operation){
            case "add":
                System.out.println("Result of addition: "+Basic.add(num1, num2));
                break;
            case "subtract":
                System.out.println("Result of subtraction: "+Basic.subtract(num1, num2));
                break;
            case "multiply":
                System.out.println("Result of multiplication: "+Basic.multiply(num1, num2));
                break;
            case "divide":
                System.out.println("Result of divide: "+Basic.divide(num1, num2));
                break;
            case "power":
                System.out.println("Result of power operation: "+Scientific.power(num1, num2));
                break;
            default:
                System.out.println("Invalid operation");
        }
        // TODO code application logic here
    }

}

