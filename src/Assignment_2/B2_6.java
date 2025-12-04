/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_2;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
Check if a user input number is a two-digit, three-digit or a four-digit number.
Example :
Input: 3467
Output: It is a four digit number !
 */
public class B2_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

        if (number >= 0 && number <= 9) {
            System.out.println("number is one digit");
        } else if (number >= 10 && number <= 99) {
            System.out.println("number is two digit");
        } else if (number >= 100 && number <= 999) {
            System.out.println("number is three digit");
        } else if (number >= 1000 && number <= 9999) {
            System.out.println("number is four digit");
        } else {
            System.out.println("number is more than four digit");
        }
        // TODO code application logic here
    }

}
