package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartDoorLockTest {
    private SimpleSmartDoorLock smartDoorLock;
    private int initialPin = 1234;

    @BeforeEach
    void beforeEach() {
        smartDoorLock = new SimpleSmartDoorLock(initialPin);
    }

    @Test
    public void testUnlockDoor() {
        smartDoorLock.unlock(initialPin);
        assertTrue(!smartDoorLock.isLocked());
    }
}
