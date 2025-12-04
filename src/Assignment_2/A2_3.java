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
3. Depending on the age input by user, display if the user is a minor (0-17 yrs), adult
(18-59 yrs) or a senior citizen(60+ yrs).
 */
public class A2_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        if (age >= 0 && age <= 17) {
            System.out.println("minor");
        } else if (age >= 18 && age <= 59) {
            System.out.println("adult");
        } else {
            System.out.println("senior citizen");
        }
        // TODO code application logic here
    }

}
