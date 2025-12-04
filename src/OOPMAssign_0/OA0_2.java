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
2. Implement the following class structure in the program :

Pen
type
colour
brand
price

setPenDetails() : set all details of a pen
printPenDetails() : print all details of a pen

Create at least 2 different objects of Pen class, setting different attributes for them and
print their details.
 */
class pen {

    String type, color, brand;
    int price;

    public void setType(String type, String color, String brand, int price) {
        this.type = type;
        this.color = color;
        this.brand = brand;
        this.price = price;

    }

    void pendetails() {
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

}

public class OA0_2 {

    public static void main(String[] args) {
        pen obj1 = new pen();

        obj1.setType("Ballpoint", "blue", "Butterflow", 20);

        pen obj2 = new pen();

        obj2.setType("Gel", "Black", "Uni-ball", 30);

        obj1.pendetails();
        obj2.pendetails();

        // TODO code application logic here
    }

}
