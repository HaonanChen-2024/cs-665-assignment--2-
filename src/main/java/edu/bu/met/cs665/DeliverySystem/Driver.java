package edu.bu.met.cs665.DeliverySystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/11/2024
 * File Name: Driver.java
 * Description: The Driver class implements the Observer interface.
 * It represents a driver who receives and manages delivery requests.
 */
public class Driver implements Observer {
    private String name;
    // List to store received delivery request messages
    private List<String> receivedMessages;
    // Boolean field to track if the driver has been notified
    private boolean isNotified;

    /**
     * Constructor that initializes a Driver with a name.
     *
     * @param name The name of the driver.
     */
    public Driver(String name) {
        this.name = name;
        this.receivedMessages = new ArrayList<>();
        this.isNotified = false;  // Default value, driver has not been notified yet
    }

    /**
     * This method is called when the driver is notified of a new delivery request.
     * It stores the delivery request message, sets isNotified to true, and prints the notification.
     *
     * @param deliveryRequest The delivery request message sent to the driver.
     */
    @Override
    public void receiveUpdatedMessage(DeliveryRequest deliveryRequest) {
        receivedMessages.add(deliveryRequest.getDeliveryRequestMessage());
        isNotified = true;  // Set notification status to true
        System.out.println("Driver " + name + " received a new delivery request: " + deliveryRequest.getDeliveryRequestMessage());
    }

    /**
     * This method allows the driver to remove a specific message from the received list.
     * If the message exists in the list, it will be removed and a confirmation message is printed.
     *
     * @param message The delivery request message to be removed.
     */
    @Override
    public boolean removeMessage(String message) {
        if (receivedMessages.remove(message)) {
            System.out.println("Driver " + name + " has removed the message: " + message);
            return true; // Return true if the message was successfully removed
        } else {
            System.out.println("Message not found: " + message);
            return false; // Return false if the message was not found
        }
    }


    /**
     * This method prints all received messages for the driver.
     */
    public void printMessages() {
        System.out.println("Driver " + name + " has the following messages: " + receivedMessages);
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for isNotified
    public boolean isNotified() {
        return isNotified;
    }

    public void setNotified(boolean notified) {
        isNotified = notified;
    }

    // Getter for receivedMessages
    public List<String> getReceivedMessages() {
        return receivedMessages;
    }
}
