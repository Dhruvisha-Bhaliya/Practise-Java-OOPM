/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_4;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
3.Two numbers n1 and n2 are entered by the user. Write a program to find the value of
n1 raised to the power of n2.
Input : n1=5, n2=3
Output : answer = 5³ = 125

 */
public class B4_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter number2: ");
        int n2 = sc.nextInt();

        double result = Math.pow(n1, n2);

        System.out.println("Answer: " + n1 + " raise to the power of " + n2 + " = " + result);

        // TODO code application logic here
    }

}
