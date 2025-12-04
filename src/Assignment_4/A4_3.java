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
3. Print factorial value of any number entered by the user.
(Hint : n! = n*(n-1)*(n-2)*(n-3)*(n-4) * ... * 1
Example : 5! = 5*4*3*2*1 = 120 )

a) using while() loop
b) using for() loop
 */
public class A4_3 {

    public static void main(String[] args) {
        int i = 1;
        int fact = 1, n = 4;

        //for loop:---
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }

        // While loop:---
        System.out.println(fact);
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);

    }

}
