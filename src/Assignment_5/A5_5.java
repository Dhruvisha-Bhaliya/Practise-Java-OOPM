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
5.
@ @ @ @ @
@       @
@       @
@       @
@ @ @ @ @
 */
public class A5_5 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    System.out.print("@");
                } else if (j == 0 || j == 4) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// TODO code application logic here

