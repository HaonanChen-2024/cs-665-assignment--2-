package edu.bu.met.cs665.DeliverySystem;

/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/11/2024
 * File Name: DeliveryRequest.java
 * Description: The constructor for initializing the delivery message which will be sent to the observers.
 */

public class DeliveryRequest {
    // The message containing the details of the delivery request.
    private final String deliveryRequestMessage;


    /**
     * Constructor that initializes the delivery request with a specific message.
     *
     * @param deliveryRequestMessage The message containing details about the delivery request.
     */
    public DeliveryRequest(String deliveryRequestMessage) {
        this.deliveryRequestMessage = deliveryRequestMessage;
    }

    /**
     * Retrieves the message of the delivery request.
     *
     * @return The delivery request message.
     */
    public String getDeliveryRequestMessage() {
        return deliveryRequestMessage;
    }

}
