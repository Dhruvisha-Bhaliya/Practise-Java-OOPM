/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOPMAssign_0;

/**
 *
 * @author DHRUVI
 */
/*
1. Create a user defined class named Area. It should contain the following methods:

circle() : to print area of a circle
square() : to print area of a square
triangle() : to print area of a triangle

[NOTE : define PI as a final variable in Area class]
Create an object, initialize necessary parameters within the concerned methods, and print
the area of all shapes in output.
 */
class Area {

    private double PI = 3.14;

    public void circle(double radius) {
        double area = PI * radius * radius;
        System.out.println("The area of circle is: " + area);

    }

    public void square(double side) {
        double area = side * side;
        System.out.println("The area of square is: " + area);
    }

    public void triangle(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("The area of triangle is: " + area);
    }
}

public class OA0_1 {

    public static void main(String[] args) {
        Area a1 = new Area();

        a1.circle(0.4);

        a1.square(0.9);

        a1.triangle(0.5, 0.3);
        // TODO code application logic here
    }

}
