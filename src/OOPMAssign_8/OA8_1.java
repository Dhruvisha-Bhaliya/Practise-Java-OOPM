/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOPMAssign_8;

/**
 *
 * @author DHRUVI
 */

/*
Aim : Implementing Abstraction using abstract class

QUESTION 1:

A. Create an abstract class called Shape which has three subclasses: Circle, Triangle and
Rectangle.

B. Define an abstract method area() in the abstract class and override this area() in all the
three subclasses to calculate the area for specific object as follows:

area() of Triangle subclass should calculate area of Triangle.
area() of Rectangle subclass should calculate area of Rectangle.
area() of Circle subclass should calculate area of Circle
 */
abstract class Shape {

    public abstract double area();
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

public class OA8_1 {

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Triangle t1 = new Triangle(4,3);
        Rectangle r1 = new Rectangle(6,4);
        
        System.out.println("Area of Circle: "+c1.area());
        System.out.println("Area of Triangle: "+t1.area());
        System.out.println("Area of Rectangle: "+r1.area());
        // TODO code application logic here
    }

}
