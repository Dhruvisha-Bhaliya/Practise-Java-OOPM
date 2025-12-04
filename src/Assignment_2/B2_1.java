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
1.Input length and width of a rectangle, and determine if it is a square or not using
ternary operator.
 */
public class B2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = sc.nextInt();
        System.out.println("Enter width: ");
        int width = sc.nextInt();

        String square = (length == width) ? "The rectangle is square." : "The rectangle is not square"; // ternory  operator

        System.out.println(square);
        // TODO code application logic here
    }

}
