/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOPMAssign_5;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
PART 1
Aim : Implementing Multilevel Inheritance
1. Implement the following inheritance :

2. Using an array of objects, add and display data of at least 3 Under Graduate Students.
Input the values of student’s name, phone number, email address, enrollment number,
course and total marks scored.
[NOTE : CGPA should not be input, but must be calculated using calcCGPA]
[CGPA = TotalMarks x 10 / 500 , TotalMarks should be from 0 to 500 only]

 */
class Person {

    protected String name;
    protected int Phone_number;
    protected String Email_Address;

    public Person(String name, int Phone_number, String Email_Address) {
        this.name = name;
        this.Phone_number = Phone_number;
        this.Email_Address = Email_Address;
    }

}

class Student extends Person {

    protected int enrollment_number;

    public Student(String name, int Phone_number, String Email_Address, int enrollment_number) {
        super(name, Phone_number, Email_Address);
        this.enrollment_number = enrollment_number;
    }

}

class UnderGraduateStudent extends Student {

    protected String course;
    protected int Total_marks;
    protected double CGPA;

    public UnderGraduateStudent(String name, int Phone_number, String Email_Address, int enrollment_number, String course, int Total_marks) {
        super(name, Phone_number, Email_Address, enrollment_number);
        this.course = course;
        this.Total_marks = Total_marks;
        this.CGPA = calcCGPA(Total_marks);
    }
    
    private double calcCGPA(int Total_marks){
        if(Total_marks < 0 && Total_marks > 500){
               return 0.0;
        }
        return (Total_marks * 10)/500;
    }

}

public class OA5_P_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student(at least 3): ");
        int n = sc.nextInt();

        UnderGraduateStudent[] ugs = new UnderGraduateStudent[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student" + (i + 1) + " : ");
            System.out.println("Name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.println("Phone number: ");
            int Phone_number = sc.nextInt();
            sc.nextLine();
            System.out.println("Email Address: ");
            String Email_Address = sc.nextLine();
            System.out.println("Enrollment number: ");
            int enrollment_number = sc.nextInt();
            System.out.println("Course: ");
            String Course = sc.next();
            sc.nextLine();
            System.out.println("Total marks: ");
            int Total_marks = sc.nextInt();
            
            ugs[i] = new UnderGraduateStudent(name, Phone_number, Email_Address, enrollment_number, Course, Total_marks);
        }
        System.out.println("\nStudent details: ");
        System.out.println("name\tPhone_number\tEmail_Address\tenrollment_number\tCourse\tTotal_marks\tCGPA");
        System.out.println("-----------------------------------------------------------");

        for (UnderGraduateStudent u1 : ugs) {
            System.out.println(u1.name + "\t" + u1.Phone_number + "\t" + u1.Email_Address + "\t" + u1.enrollment_number + "\t" + u1.course + "\t" + u1.Total_marks + "\t" + u1.CGPA);

        }
        // TODO code application logic here
    }

}
