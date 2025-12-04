/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOPMAssign_6;

/**
 *
 * @author DHRUVI
 */

/*
Aim : Implementing Static Polymorphism using Method Overloading

Consider you are developing an application for calculating CGPA of students.

Create a Student class which accepts basic details of a Student like enr_no, s_name, dept.
[Marks obtained should be between 0 and 500.]
Overload the calcCGPA() method which calculates the CGPA based on different input values and
different formulas.
calcCGPA() with Percentage as a parameter -
CGPA= Percentage / 9.5
calcCGPA() with Total Grade Point Obtained as a parameter -
CGPA= Total Grade Point Obtained / No. of Subjects
[Grade Points must be numbers between 0 and 50, Total Subjects = 5]
calcCGPA() with SGPA of both sem1 & sem2 as parameters-
CGPA = SGPA of sem1 + SGPA of sem2 / Number of semesters
[SGPA must be between 1 and 10]

Create a main class called CalcCGPA and calculate the CGPA through all the methods.
 */
class Student {

    private int enr_no;
    private String s_name;
    private String dept;

    public Student(int enr_no, String s_name, String dept) {
        this.enr_no = enr_no;
        this.s_name = s_name;
        this.dept = dept;
    }

    public void calcCGPA(double percentage) {
        if (percentage >= 0 && percentage <= 100) {
            double cgpa = percentage / 9.5;
            System.out.println("CGPA based on Percentage: " + cgpa);
        } else {
            System.out.println("Invalid percentage value.Marks obtained should be between 0 and 100.");
        }
    }

    public void calcCGPA(int totalGradePoint) {
        if (totalGradePoint >= 0 && totalGradePoint <= 50) {
            double cgpa = totalGradePoint / 5.0; //Assuming 5 subjects
            System.out.println("CGPA based on Total Grade Point Obtained: " + cgpa);
        } else {
            System.out.println("Invalid total Grade point value. Grade Points must be between 0 and 50.");
        }
    }

    public void calcCGPA(double sgpaSem1, double sgpaSem2) {
        if(sgpaSem1 >= 1 && sgpaSem1 <= 10 && sgpaSem2 >= 1 && sgpaSem2 <= 10){
        double cgpa = (sgpaSem1 + sgpaSem2) / 2.0; // Assuming 2 semester;
        System.out.println("CGPA based on SGPA of sem1 & sem2: " + cgpa);
        }else{
            System.out.println("Invalid SGPA value. SGPA must be between 1 and 10.");
        }
    }

}

public class OA6_1 {

    public static void main(String[] args) {
        Student obj1 = new Student(101, "Dhruvi", "Information Technology");

        obj1.calcCGPA(85.14);
        obj1.calcCGPA(40);
        obj1.calcCGPA(8.88, 9.50);
        // TODO code application logic here
    }

}
