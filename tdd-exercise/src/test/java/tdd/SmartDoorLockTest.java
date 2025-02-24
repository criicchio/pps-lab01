package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartDoorLockTest {
    private SimpleSmartDoorLock smartDoorLock;
    private int initialPin = 1234;

    @BeforeEach
    void beforeEach() {
        smartDoorLock = new SimpleSmartDoorLock();
        smartDoorLock.setPin(initialPin);
    }

    @Test
    public void testUnlockDoor() {
        smartDoorLock.unlock(initialPin);
        assertFalse(smartDoorLock.isLocked());
    }

    @Test
    public void testLockDoor() {
        smartDoorLock.lock();
        assertTrue(smartDoorLock.isLocked());
    }
}
