package tdd;

public class SimpleSmartDoorLock implements SmartDoorLock {
    private int pin;
    private boolean locked = false;


    @Override
    public void setPin(int pin) {
        //TODO add constraint after test is done
        this.pin = pin;
        this.locked = true;
    }

    @Override
    public void unlock(int pin) {
        //TODO add more implementation after test is done
        if (this.pin == pin) {
            this.locked = false;
        }
    }

    @Override
    public void lock() {

    }

    @Override
    public boolean isLocked() {
        return false;
    }

    @Override
    public boolean isBlocked() {
        return false;
    }

    @Override
    public int getMaxAttempts() {
        return 0;
    }

    @Override
    public int getFailedAttempts() {
        return 0;
    }

    @Override
    public void reset() {

    }
}
