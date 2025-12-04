/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_4;

/**
 *
 * @author DHRUVI
 */

/*
1.Print multiplication table of number n, input by user.

a) using while() loop
b) using for() loop
 */
public class B4_1 {

    public static void main(String[] args) {
        int n = 4, i = 1;

        //For loop:--
        for (i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }

        //While loop:--
        while (i <= 10) {
            System.out.println(n + " * " + i + " = " + n * i);
            i++;
        }
        // TODO code application logic here
    }

}
