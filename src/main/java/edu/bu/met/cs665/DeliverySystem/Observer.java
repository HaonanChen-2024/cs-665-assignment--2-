package edu.bu.met.cs665.DeliverySystem;

/**
 * Name: Haonan Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/11/2024
 * File Name: Observer.java
 * Description: The Observer interface defines methods for receiving and managing delivery requests.
 * It should be implemented by any class that wants to be notified of delivery requests
 * and manage those requests by receiving and removing messages.
 */
public interface Observer {
    /**
     * This method is called when the observer is notified of a new delivery request.
     * The observer will handle the received delivery request message.
     *
     * @param deliveryRequest The delivery request message sent to the observer.
     */
    void receiveUpdatedMessage(DeliveryRequest deliveryRequest);

    /**
     * This method allows the observer to remove a specific message from its received list.
     * If the message exists in the list, it will be removed.
     *
     * @param message The delivery request message to be removed.
     */
    boolean removeMessage(String message);
}
