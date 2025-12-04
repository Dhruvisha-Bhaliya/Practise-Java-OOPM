/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOPMAssign_3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
PART 2
Create the following exceptions, with reference to the Student class created in previous
assignments:

1. If the user tries to input a String value for the s_id, throw the InputMismatchException
and print the message “Invalid Input !” in the catch block.

2. If the user enters total_marks less than zero or greater than 500, throw a user-defined
exception named “InvalidMarksException”.

3.Finally, print the message “Student details entered!”, regardless of if any exception is
raised or not.
 */
class InvalidMarksException extends Exception {

    public InvalidMarksException(String message) {
        super(message);
    }
}

class Student {

    private int s_id;
    private String s_name;
    private String dob;
    private String dept;
    private int total_marks;
    private double perc;

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
        try {
            setTotal_marks(total_marks);
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
            System.exit(0); // not run entire error solve
        }
        calcPerc();
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        try {
            if (s_id < 0) {
                throw new InputMismatchException();
            }
            this.s_id = s_id;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }

    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getTotal_marks() {
        return total_marks;
    }

    public void setTotal_marks(int total_marks) throws InvalidMarksException {
        if (total_marks < 0 || total_marks > 500) {
            throw new InvalidMarksException("InvalidMarksException: Total marks must be between 0 and 500.");
        }
        this.total_marks = total_marks;
    }

    public double getPerc() {
        return perc;
    }

    public void setPerc(double perc) {
        this.perc = perc;
    }

    // Method to calculate the percentage
    private void calcPerc() {
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
//    public void getStudentDetails() {
//        System.out.println(s_id + "\t" + s_name + "\t" + dob + "\t" + dept + "\t" + perc + "\t");
//        isEligibleToEnroll();
//    }
    public void getStudentDetails() {
        System.out.format("%-10d%-20s%-20s%-20s%-10.2f%-20s\n", getS_id(), getS_name(), getDob(), getDept(), getPerc(), (perc > 65 ? "Eligible" : "Not Eligible"));
    }
}

public class OA3P2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter details for student 1:\nId: ");
            int id1 = 0;
            try {
                id1 = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input!");
                System.exit(0);
            }
            System.out.print("Name: ");
            String name1 = scanner.next();
            System.out.print("DOB: ");
            String dob1 = scanner.next();
            System.out.print("Dept: ");
            String dept1 = scanner.next();
            System.out.print("Total Marks: ");
            int marks1 = 0;
            try {
                marks1 = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input!");
                System.exit(0);
            }

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
            int marks2 = 0;
            try {
                marks2 = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input!");
                System.exit(0);
            }

            Student student2 = new Student(id2, name2, dob2, dept2, marks2);

            // Print the table header
            System.out.format("%-10s%-20s%-20s%-20s%-10s%-20s\n", "Id", "Name", "DOB", "Dept", "Perc", "Eligibility");

            // Print details of both students in tabular form
            student1.getStudentDetails();
            student2.getStudentDetails();

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input!");

        } finally {
            System.out.println("Student details entered!");
        }
    }
}
