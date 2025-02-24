package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartDoorLockTest {
    private SimpleSmartDoorLock smartDoorLock;

    @BeforeEach
    void beforeEach() {
        int initialPin = 1234;
        smartDoorLock = new SimpleSmartDoorLock(initialPin);
    }

    @Test
    public void todo() {
        assertTrue(true);
    }
}
