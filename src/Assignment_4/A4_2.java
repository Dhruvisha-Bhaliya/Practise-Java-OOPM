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
2. Print odd number series of natural numbers 1 to n in reverse order, where n is
user-input.
 */
public class A4_2 {

    public static void main(String[] args) {
        int number = 10;
        for (int i = number; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        // TODO code application logic here
    }

}
