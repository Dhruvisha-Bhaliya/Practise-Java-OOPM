/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_5;

/**
 *
 * @author DHRUVI
 */

/*
6.
    * * * * * * *
   * * * * * * *
  * * * * * * *
 * * * * * * *
* * * * * * *
 */
public class A5_6 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 7; k++) {
                System.out.print("* ");
            }
            System.out.println();
            // TODO code application logic here
        }
    }
}
