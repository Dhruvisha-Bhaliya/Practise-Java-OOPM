/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignment_2;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
4. Input cost price and selling price of a product and determine if there is profit or loss.
Display the final amount of profit / loss.
(Hint : Profit = SP - CP and Loss = CP - SP)
 */
public class B2_4 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter cost price: ");
        double cost = reader.nextDouble();

        System.out.println("Enter selling price: ");
        double selling = reader.nextDouble();

        if (selling > cost) {
            double Profit = selling - cost;
            System.out.println("There is a profit $: " + Profit);
        } else if (selling < cost) {
            double Loss = cost - selling;
            System.out.println("There is a Loss $: " + Loss);
        } else {
            System.out.println("No profit and no loss");
        }
        // TODO code application logic here
    }

}
