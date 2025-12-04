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
5. Input marks of three subjects (m1, m2, m3) from the user. Display total percentage
and based on percentage, display final grade as below :
Perc Grade
70 - 100 Distinction
60 - 69 First Class
50 - 59 Second Class
40 - 49 Pass Class
0 - 39 Fail
 */
public class B2_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for subject 1: ");
        int m1 = scanner.nextInt();

        System.out.print("Enter marks for subject 2: ");
        int m2 = scanner.nextInt();

        System.out.print("Enter marks for subject 3: ");
        int m3 = scanner.nextInt();

        int totalMarks = m1 + m2 + m3;
        double percentage = (totalMarks / 3.0);

        System.out.println("Total Percentage: " + percentage + "%");

        if (percentage >= 70) {
            System.out.println("Grade: Distinction");
        } else if (percentage >= 60) {
            System.out.println("Grade: First Class");
        } else if (percentage >= 50) {
            System.out.println("Grade: Second Class");
        } else if (percentage >= 40) {
            System.out.println("Grade: Pass Class");
        } else {
            System.out.println("Grade: Fail");
        }
        // TODO code application logic here
    }

}
