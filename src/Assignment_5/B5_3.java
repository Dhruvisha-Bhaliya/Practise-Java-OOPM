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
3.
1
2 4
3 6 9
4 8
5
 */
public class B5_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int count = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (count != 12 && count != 16 && count != 10 && count != 15 && count != 20 && count != 25) {
                    System.out.print(count + " ");
                }
                count += i;
            }
            System.out.println();
            count = i + 1;
        }
        // TODO code application logic here
    }

}
