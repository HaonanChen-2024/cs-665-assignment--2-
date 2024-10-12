import edu.bu.met.cs665.DeliverySystem.Driver;
import edu.bu.met.cs665.DeliverySystem.Shop;

/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/11/2024
 * File Name: Observer.java
 * Description: The Mian entry of the delivery program
 * */

public static void main(String[] args) {
    // Create a shop
    Shop shop = new Shop();

    // Create drivers
    Driver driver1 = new Driver("Alice");
    Driver driver2 = new Driver("Bob");
    Driver driver3 = new Driver("Charlie");
    Driver driver4 = new Driver("David");
    Driver driver5 = new Driver("Eve");

    // Add drivers to the shop
    shop.addDriver(driver1);
    shop.addDriver(driver2);
    shop.addDriver(driver3);
    shop.addDriver(driver4);
    shop.addDriver(driver5);

    // Send a delivery request
    shop.sendDeliveryRequest("Deliver to 123 Main St.");

    // Print received messages for each driver
    driver1.printMessages();
    driver2.printMessages();
    driver3.printMessages();
    driver4.printMessages();
    driver5.printMessages();

    // Remove a driver and send another request
    shop.removeDriver(driver3);
    shop.sendDeliveryRequest("Deliver to 456 Oak St.");

    // Print received messages again
    driver1.printMessages();
    driver2.printMessages();
    driver4.printMessages();
    driver5.printMessages();
}
