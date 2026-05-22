/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chamarujayasinghe
 */
public class DeliveryChargeTest {
    public static void main(String[] args) {
        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        System.out.println("Base Charge Only: " + calculator.calculateCharge(1000.0));
        System.out.println("Charge with Distance: " + calculator.calculateCharge(1000.0, 5.0));
        System.out.println("Charge with Distance & Weight: " + calculator.calculateCharge(1000.0, 5.0, 2.0));
        System.out.println("Charge with Express Delivery: " + calculator.calculateCharge(1000.0, true));

    }
}
