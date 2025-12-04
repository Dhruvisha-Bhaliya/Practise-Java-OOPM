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
3. a) Check if user input is only of one character, otherwise print “Invalid input”.
(Hint : Use built-in method String.length() to check length of input String)

b) In the same code, further check if that character input by user is a vowel or a
consonant
 */
public class B2_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input: ");
        String input = sc.next();

        if (input.length() == 1) {
            char character = input.charAt(0);
            System.out.println("Input is single character");
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'
                    || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                System.out.println("The input charactor is vowel");
            } else {
                System.out.println("The input charactor is consonant");
            }
        } else {
            System.out.println("Invalid input");
        }

    }

}
