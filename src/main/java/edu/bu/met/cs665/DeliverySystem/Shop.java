package edu.bu.met.cs665.DeliverySystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/11/2024
 * File Name: Shop.java
 * Description: The Shop class implements the DeliveryObservable interface.
 * It manages the list of drivers and notifies them about delivery requests.
 */
public class Shop implements DeliveryObservable {
    // List to store the registered drivers
    private List<Observer> drivers;

    /**
     * Constructor that initializes the Shop with an empty list of drivers.
     */
    public Shop() {
        this.drivers = new ArrayList<>();
    }

    /**
     * Adds a driver to the shop's list of observers.
     *
     * @param driver The driver to be added.
     */
    @Override
    public void addDriver(Observer driver) {
        // Check if the driver is already in the list
        if (!drivers.contains(driver)) {
            drivers.add(driver);
            System.out.println("Driver added: " + ((Driver) driver).getName());
        } else {
            System.out.println("Driver already added: " + ((Driver) driver).getName());
        }
    }


    /**
     * Removes a driver from the shop's list of observers.
     *
     * @param driver The driver to be removed.
     */
    @Override
    public void removeDriver(Observer driver) {
        if (drivers.remove(driver)) {
            System.out.println("Driver removed: " + ((Driver) driver).getName());
        } else {
            System.out.println("Driver not found.");
        }
    }

    /**
     * Sends a delivery request to all registered drivers.
     *
     * @param deliveryRequest The delivery request to be sent.
     */
    @Override
    public void notifyDrivers(DeliveryRequest deliveryRequest) {
        for (Observer driver : drivers) {
            driver.receiveUpdatedMessage(deliveryRequest);
        }
    }

    /**
     * This method is called to send a delivery request to the drivers.
     * It internally calls the notifyDrivers method after creating a DeliveryRequest object.
     *
     * @param deliveryRequestMessage The message of the delivery request.
     */
    @Override
    public void sendDeliveryRequest(String deliveryRequestMessage) {
        DeliveryRequest deliveryRequest = new DeliveryRequest(deliveryRequestMessage);
        notifyDrivers(deliveryRequest);
    }

    /**
     * Gets the list of registered drivers.
     *
     * @return The list of drivers.
     */
    public List<Observer> getDrivers() {
        return drivers;
    }
}
