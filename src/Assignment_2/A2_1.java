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
1.Check if a year input by user is a leap year or not.
 */
public class A2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not Leap year");
        }
        // TODO code application logic here
    }

}
