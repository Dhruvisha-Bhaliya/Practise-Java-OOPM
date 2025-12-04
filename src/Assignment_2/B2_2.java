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
2. Input all three angles of a triangle and display if it is a valid triangle or not.
(Hint : sum of all angles of a triangle = 180°)
 */
public class B2_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the three angles of the triangle: ");
        int angle1 = input.nextInt();
        int angle2 = input.nextInt();
        int angle3 = input.nextInt();

        int sum = angle1 + angle2 + angle3;

        String ValidTriangle = (sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0)
                ? "The triangle with angles " + angle1 + ", " + angle2 + ", and " + angle3 + " is a valid triangle."
                : "The triangle with angles " + angle1 + ", " + angle2 + ", and " + angle3 + " is not a valid triangle.";

        System.out.println(ValidTriangle);
        // TODO code application logic here
    }

}
