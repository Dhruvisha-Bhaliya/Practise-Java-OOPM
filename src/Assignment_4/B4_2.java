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
2.Accept 5 integers from the user using any loop and print their average.
 */
public class B4_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter number: " + i);

            int num = sc.nextInt();
            sum += num;
        }

        double avarage = (double) sum / 5;
        System.out.println("Avarage is: " + avarage);
        // TODO code application logic here
    }

}
