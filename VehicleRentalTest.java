/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chamarujayasinghe
 */
public class VehicleRentalTest {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Car("CAR1", "HONDA", 5, 8000.0);

        Vehicle vehicle2 = new Bike("BIKE2", "BAJAJ", 10, 500.0);

        vehicle1.displayVehicleInfo();

        double carCost = vehicle1.calculateRentalCost();

        System.out.println("Car Rental Cost: " + carCost);

        System.out.println();

        vehicle2.displayVehicleInfo();

        double bikeCost = vehicle2.calculateRentalCost();

        System.out.println("Bike Rental Cost: " + bikeCost);
    }
}