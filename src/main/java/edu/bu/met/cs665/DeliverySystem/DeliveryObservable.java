package edu.bu.met.cs665.DeliverySystem;

/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/11/2024
 * File Name: DeliveryObservable.java
 * Description: This interface defines the methods for managing drivers and notifying them
 * about delivery requests. The Shop class will implement this interface.
 */
public interface DeliveryObservable {

    /**
     * Adds a driver to the shop's list of observers.
     *
     * @param driver The driver to be added.
     */
    void addDriver(Observer driver);

    /**
     * Removes a driver from the shop's list of observers.
     *
     * @param driver The driver to be removed.
     */
    void removeDriver(Observer driver);

    /**
     * Sends a delivery request to all registered drivers.
     *
     * @param deliveryRequest The delivery request to be sent.
     */
    void notifyDrivers(DeliveryRequest deliveryRequest);

    /**
     * This method is called to send a delivery request to the drivers.
     * It internally calls the notifyDrivers method after creating a DeliveryRequest object.
     *
     * @param deliveryRequestMessage The message of the delivery request.
     */
    void sendDeliveryRequest(String deliveryRequestMessage);
}
