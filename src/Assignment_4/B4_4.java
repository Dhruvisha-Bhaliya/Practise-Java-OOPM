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
4.Keep accepting integer values from the user. If at any time, the user enters ‘0’,
terminate the program. Lastly, print the product of all input numbers.
 */
public class B4_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int product = 1;
        int num;

        System.out.println("Enter integer: ");
        while (true) {
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            product *= num;
        }

        System.out.println(product);
        sc.close();
        // TODO code application logic here
    }

}
