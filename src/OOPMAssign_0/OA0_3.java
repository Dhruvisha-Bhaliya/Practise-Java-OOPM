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
Implement the following class structure in the program :

ArraySum
num[]
setElements(int[] array) : initialize array elements
printSum() : prints the sum of array elements

Create at least 2 different objects of the ArraySum class and print the sum of both.
 */
public class OA0_3 { // public class Arraysum

    int[] num;

    public OA0_3(int[] array) {
        this.num = array;
    }

    public void setElement(int[] array) {
        this.num = array;
    }

    public void printsum() {
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        System.out.println("Sum of Array elements : " + sum);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        OA0_3 obj = new OA0_3(array1);
        OA0_3 obj1 = new OA0_3(array2);

        obj.printsum();
        obj1.printsum();
        // TODO code application logic here
    }

}
