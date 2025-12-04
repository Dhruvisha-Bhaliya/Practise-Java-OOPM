/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_5;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
6.
1111111
1111122
1111333
1114444
1155555
1666666
7777777
*/
public class B5_6 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        
    for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print(1);
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
       }
        // TODO code application logic here
    }
    

