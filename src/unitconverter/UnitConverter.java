/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unitconverter;

import java.util.Scanner;

/**
 *
 * @author Paledi.Egnitius
 */
public class UnitConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the unit you want to convert from: ");
        String fromUnit = input.nextLine();

        System.out.print("Enter the unit you want to convert to: ");
        String toUnit = input.nextLine();

        System.out.print("Enter the quantity to be converted: ");
        double quantity = input.nextDouble();

        double result = 0;

        if (fromUnit.equalsIgnoreCase("feet") && toUnit.equalsIgnoreCase("meters")) {
            result = feetToMeters(quantity);
        } else if (fromUnit.equalsIgnoreCase("pounds") && toUnit.equalsIgnoreCase("kgs")) {
            result = poundsToKgs(quantity);
        } else if (fromUnit.equalsIgnoreCase("fahrenheit") && toUnit.equalsIgnoreCase("celsius")) {
            result = fahrenheitToCelsius(quantity);
        } else {
            System.out.println("Invalid conversion units.");
            System.exit(0);
        }

        System.out.println(quantity + " " + fromUnit + " is equal to " + result + " " + toUnit);
    }

    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static double poundsToKgs(double pounds) {
        return pounds * 0.453592;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}