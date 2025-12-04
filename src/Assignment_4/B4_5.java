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
5.Accept values of n integers (where n is also input by user). Print their sum at the end
of the program.
Consider the condition => sum should not exceed 5000 in any case. If at any time, the
value of sum exceeds 5000, terminate the loop.

 */
public class B4_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0, value;

        System.out.print("Enter the number of integers to sum: ");
        n = scanner.nextInt();

        System.out.println("Enter the integers:");

        for (int i = 0; i < n; i++) {
            value = scanner.nextInt();

            if (sum + value > 5000) {
                System.out.println("Sum exceeds 5000. Terminating the program.");
                break;
            }

            sum += value;
        }

        System.out.println("The sum of the integers is: " + sum);
        // TODO code application logic here
    }

}
