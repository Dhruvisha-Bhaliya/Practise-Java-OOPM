/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

 */
package OOPMAssign_1;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
1. Implement the following structure :

Student
s_id
s_name
dob
dept
total_marks (out of 500)
perc

Student() : a constructor
Student() : a constructor to initialize all instance variables
calcPerc() : calculate the perc of a student
isEligibleToEnroll() : print the eligibility message
getStudentDetails() : print all details of a student

If the default constructor is used, then the value must be set to “IT”.
The calcPerc() method is used to calculate the percentage, based on total_marks input by
the user.
The isEligibleToEnroll() method will print “Eligible” if the percentage is above 65, else it
will print “Not Eligible”.
Enter values for at least 2 students and print the details in a tabular form.
[Static input will not be considered.]

Expected Output :
Id Name DOB Dept Perc Eligibility
1 Charles 17/03/2004 IT 72 Eligible
2 Mark 22/08/2003 MB 55 Not Eligible
 */
class Student {

    int s_id;
    String s_name;
    String dob;
    String dept;
    int total_marks;
    double perc;

    // Default constructor
    public Student() {
        this.dept = "IT";
    }

    // Parameterized constructor to initialize all instance variables
    public Student(int s_id, String s_name, String dob, String dept, int total_marks) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.dob = dob;
        this.dept = dept;
        this.total_marks = total_marks;
        calcPerc();
    }

    // Method to calculate the percentage
    public void calcPerc() {
        this.perc = (double) total_marks / 500 * 100;
    }

    // Method to check eligibility
    public void isEligibleToEnroll() {
        if (perc > 65) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }

    // Method to print student details
    public void getStudentDetails() {
        System.out.println(s_id + "\t" + s_name + "\t" + dob + "\t" + dept + "\t" + perc + "\t");
        isEligibleToEnroll();
    }
}

public class OA1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter details for student 1:\nId: ");
        int id1 = scanner.nextInt();
        System.out.print("Name: ");
        String name1 = scanner.next();
        System.out.print("DOB: ");
        String dob1 = scanner.next();
        System.out.print("Dept: ");
        String dept1 = scanner.next();
        System.out.print("Total Marks: ");
        int marks1 = scanner.nextInt();

        Student student1 = new Student(id1, name1, dob1, dept1, marks1);

        System.out.print("\nEnter details for student 2:\nId: ");
        int id2 = scanner.nextInt();
        System.out.print("Name: ");
        String name2 = scanner.next();
        System.out.print("DOB: ");
        String dob2 = scanner.next();
        System.out.print("Dept: ");
        String dept2 = scanner.next();
        System.out.print("Total Marks: ");
        int marks2 = scanner.nextInt();

        Student student2 = new Student(id2, name2, dob2, dept2, marks2);

        // Print the table header
        System.out.println("\nId\tName\tDOB\tDept\tPerc\tEligibility");

        // Print details of both students in tabular form
        student1.getStudentDetails();
        student2.getStudentDetails();

    }
}
