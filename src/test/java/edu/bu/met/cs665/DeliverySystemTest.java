package edu.bu.met.cs665;

import static org.junit.Assert.*;

import edu.bu.met.cs665.DeliverySystem.Driver;
import edu.bu.met.cs665.DeliverySystem.Shop;
import org.junit.Before;
import org.junit.Test;

public class DeliverySystemTest {

    private Shop shop;
    private Driver driver1;

    @Before
    public void setUp() {
        shop = new Shop();
        driver1 = new Driver("Alice");
        shop.addDriver(driver1);
    }

    @Test
    public void testAddDriver() {
        assertTrue(shop.getDrivers().contains(driver1));
    }

    @Test
    public void testSendDeliveryRequest() {
        shop.sendDeliveryRequest("Deliver to 123 Main St.");
        assertEquals(1, driver1.getReceivedMessages().size());
    }

    @Test
    public void testRemoveDriver() {
        shop.removeDriver(driver1);
        assertFalse(shop.getDrivers().contains(driver1));
    }

    @Test
    public void testMultipleDriversReceiveMessage() {
        Driver driver2 = new Driver("Bob");
        shop.addDriver(driver2);

        // Send a delivery request
        shop.sendDeliveryRequest("Deliver to 123 Main St.");

        // Verify both drivers received the message
        assertEquals(1, driver1.getReceivedMessages().size());
        assertEquals(1, driver2.getReceivedMessages().size());
    }

    @Test
    public void testDriverDoesNotReceiveMessageAfterRemoval() {
        // Step 1: Send a delivery request and verify driver1 receives the first message
        shop.sendDeliveryRequest("Deliver to 123 Main St.");
        assertEquals(1, driver1.getReceivedMessages().size());

        // Step 2: Remove driver1 and send another delivery request
        shop.removeDriver(driver1);
        shop.sendDeliveryRequest("Deliver to 456 Oak St.");

        // Verify driver1 did not receive the second message
        assertEquals(1, driver1.getReceivedMessages().size()); // The size should still be 1
    }


}
