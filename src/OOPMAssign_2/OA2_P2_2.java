/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOPMAssign_2;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
2. Implement a dynamic array of objects of size n using user input values.
Print the details of all students.
 */
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
        this.total_marks = total_marks;
        calcPerc();
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
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

    public void setTotal_marks(int total_marks) {
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

public class OA2_P2_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Date of Birth (YYYY-MM-DD): ");
            String dob = scanner.nextLine();
            System.out.print("Department: ");
            String dept = scanner.nextLine();
            System.out.print("Total Marks: ");
            int totalMarks = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            students[i] = new Student(id, name, dob, dept, totalMarks);
        }

        System.out.format("%-10s%-20s%-20s%-20s%-10s%-20s\n", "Id", "Name", "DOB", "Dept", "Perc", "Eligibility");

        for (Student student : students) {
            student.getStudentDetails();
        }
        // TODO code application logic here
    }

}
