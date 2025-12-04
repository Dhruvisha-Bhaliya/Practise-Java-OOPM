/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_3;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
1. Take the designation of an employee as user input.
Using switch case; set the following values, based on their designation.

For Engineer => Basic = 30000 HRA = 2600 DA = 3000
For Manager => Basic = 40000 HRA = 4600 DA = 2500
For Clerk => Basic = 15000 HRA = 1600 DA = 1500

Lastly; calculate and display Gross Salary.
(Gross Salary = Basic + HRA + DA)
 */
public class B3_1 {

    public static void main(String[] args) {
        double Basic = 0, HRA = 0, DA = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter designation: ");
        String designation = sc.next();

        switch (designation) {
            case "Engineer":
                Basic = 30000;
                HRA = 2600;
                DA = 3000;
                break;
            case "Manager":
                Basic = 40000;
                HRA = 4600;
                DA = 2500;
                break;
            case "Clerk":
                Basic = 15000;
                HRA = 1600;
                DA = 1500;
                break;
            default:
                System.out.println("Invalid Designation");

        }

        if (Basic != 0) {
            double Gross_Salary = Basic + HRA + DA;
            System.out.println(Gross_Salary);
        }

    }

}

// TODO code application logic here

