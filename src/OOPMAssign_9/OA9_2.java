/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOPMAssign_9;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
QUESTION 2:

A. Create a class called CPU. It should contain an attribute Price.

Include a method calcPrice().

Price = (NumberOfCores x 4) x (ClockSpeed x 520).

B. Create a non-static nested class (inner class) called Processor. It contains attributes like
Manufacturer, NumberOfCores and ClockSpeed.

C. Accept the values Manufacturer, NumberOfCores and ClockSpeed for 3 distinct processors
from the user, and calculate Price of the CPU.

Accepted values for NumberOfCores: 2, 4, 6, 8.
ClockSpeed can be 2GHz, 4Ghz only.

D. If the values are invalid, throw an exception “Invalid data”.
 */
public class OA9_2 { //CPU name of class

    private double price;

    class Processor {

        private String manufacturer;
        private int numberOfCores;
        private double clockSpeed;

        public Processor(String manufacturer, int numberOfCores, double clockSpeed) {
            this.manufacturer = manufacturer;
            this.numberOfCores = numberOfCores;
            this.clockSpeed = clockSpeed;
        }

        public void validateProcessor() throws Exception {
            if (numberOfCores != 2 && numberOfCores != 4 && numberOfCores != 6 && numberOfCores != 8) {
                throw new Exception("Invalid data: Number of cores must be 2, 4, 6, or 8.");
            }
            if (clockSpeed != 2 && clockSpeed != 4) {
                throw new Exception("Invalid data: Clock speed must be 2GHz or 4GHz.");
            }
        }

        public void calcPrice() {
            price = (numberOfCores * 4) * (clockSpeed * 520);
        }
    }

    public static void main(String[] args) {
        OA9_2 cpu = new OA9_2();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter details for Processor " + i + ":");
            System.out.print("Manufacturer: ");
            String manufacturer = scanner.next();
            System.out.print("Number of Cores: ");
            int cores = scanner.nextInt();
            System.out.print("Clock Speed (2 or 4): ");
            double speed = scanner.nextDouble();

            Processor p1 = cpu.new Processor(manufacturer, cores, speed);

            try {
                p1.validateProcessor();
                p1.calcPrice();
                System.out.println("Price of CPU for Processor " + i + ": $" + cpu.price);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
