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
QUESTION 2:
A. Create an abstract base class called ElectronicDevice with the following attributes:
brand (String) - to store the brand of the device
powerConsumption (double) - to store the device's power consumption in hours

B. Include a constructor in ElectronicDevice that requires the brand and powerConsumption
values. Create a getter method for each attribute.

C. Create two abstract methods in the class:
calculateYearlyEnergyCost() - Accepts the cost of electricity per kWh (kilowatt-hour) as
input and calculates the estimated yearly energy cost of the device.
printDetails() - Prints a summary of the device's information.

D. Design two subclasses of ElectronicDevice:
Laptop - contains additional attribute screenSize (double) in inches.
Refrigerator - contains additional attribute volume (double) in cubic feet.

E. Override the calculateYearlyEnergyCost() method in each subclass.
For Laptop,
YearlyEnergyCost = powerConsumption x 60 Watts x 365 Days x 12 Rs
For Refrigerator,
YearlyEnergyCost = powerConsumption x 130 Watts x 365 Days x 20 Rs

F. Override the printDetails() method in each subclass to display information relevant to that
device type (e.g., screen size for Laptop, volume for Refrigerator) along with the inherited
information from the base class.
 */
abstract class ElectronicDevice {

    String brand;
    double powerConsumption;

    public ElectronicDevice(String brand, double powerConsumption) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public abstract void calculateYearlyEnergyCost(double costPerKWh);

    public abstract void printDetails();
}

class Laptop extends ElectronicDevice {

    double screenSize;

    public Laptop(String brand, double powerConsumption, double screenSize) {
        super(brand, powerConsumption);
        this.screenSize = screenSize;
    }

    @Override
    public void calculateYearlyEnergyCost(double costPerKWh) {
        double yearlyEnergyCost = powerConsumption * 60 * 365 * 12 * costPerKWh;
        System.out.println("Yearly Energy Cost for Laptop: Rs " + yearlyEnergyCost);
    }

    @Override
    public void printDetails() {
        System.out.println("Laptop Details - Brand: " + brand + ", Power Consumption: " + powerConsumption + "hours,Scrren Size: " + screenSize + "inches");
    }
}

class Refrigerator extends ElectronicDevice {

    double volume;

    public Refrigerator(String brand, double powerConsumption, double volume) {
        super(brand, powerConsumption);
        this.volume = volume;
    }

    @Override
    public void calculateYearlyEnergyCost(double costPerKWh) {
        double yearlyEnergyCost = powerConsumption * 130 * 365 * 20 * costPerKWh;
        System.out.println("Yearly Energy Cst for Refrigerator: Rs " + yearlyEnergyCost);
    }

    @Override
    public void printDetails() {
        System.out.println("Refrigerator Details - Brand: " + brand + ", Power Consumption: " + powerConsumption + " hours, Volume: " + volume + " cubic feet");
    }

}

public class OA8_2 {

    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell",5,15.6);
        Refrigerator r1 = new Refrigerator("LG", 10, 20);
        
        l1.printDetails();
        l1.calculateYearlyEnergyCost(10);
        
        r1.printDetails();
        r1.calculateYearlyEnergyCost(10);
        // TODO code application logic here
    }

}
