/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOPMAssign_3;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
2.Write a java program which accepts the elements of an integer array of size n, and displays
the same. Catch the ArrayIndexOutOfBoundsException whenever the user tries to access
the array outside of its bound (range).
 */
public class OA3P1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter size of array : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter element of an array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Element of array are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println("Try to access outside array bounds: ");
        try {
            System.out.println(array[n]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
// TODO code application logic here
    }

}
