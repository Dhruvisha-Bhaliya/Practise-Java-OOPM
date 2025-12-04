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
4. Display greatest of 3 numbers input by user.
a) Use nested if
b) Use logical operators
 */
public class A2_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int number2 = sc.nextInt();
        System.out.print("Enter number3: ");
        int number3 = sc.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("number1 is greater");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("number2 is greater");
        } else {
            System.out.println("number3 is greater");
        }

        int greatest = (number1 > number2 && number1 > number3) ? number1
                : (number2 > number3 ? number2 : number3); // ternory operator

        System.out.println(greatest + "is greater");

        // TODO code application logic here
    }

}
