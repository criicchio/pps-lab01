import example.model.AccountHolder;
import example.model.BankAccount;
import example.model.SimpleBankAccount;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the SimpleBankAccount implementation
 */
class SimpleBankAccountTest {

    private AccountHolder accountHolder;
    private BankAccount bankAccount;
    private double expectedBalance;
    private final int wrongUserId = 2;
    private final double generalDeposit = 100;
    private final double generalWithdraw = 70;

    @BeforeEach
    void beforeEach(){
        int userId = 1;
        double initialBalance = 0;
        accountHolder = new AccountHolder("Mario", "Rossi", userId);
        bankAccount = new SimpleBankAccount(accountHolder, initialBalance);
    }

    @Test
    void testInitialBalance() {
        expectedBalance = 0;
        assertEquals(expectedBalance, bankAccount.getBalance());
    }

    @Test
    void testDeposit() {
        expectedBalance = 100;
        bankAccount.deposit(accountHolder.getId(), generalDeposit);
        assertEquals(expectedBalance, bankAccount.getBalance());
    }

    @Test
    void testWrongDeposit() {
        double deposit = 50;
        expectedBalance = 100;
        bankAccount.deposit(accountHolder.getId(), generalDeposit);
        bankAccount.deposit(wrongUserId, deposit);
        assertEquals(expectedBalance, bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        expectedBalance = 29;
        bankAccount.deposit(accountHolder.getId(), generalDeposit);
        bankAccount.withdraw(accountHolder.getId(), generalWithdraw);
        assertEquals(expectedBalance, bankAccount.getBalance());
    }

    @Test
    void testWrongWithdraw() {
        expectedBalance = 100;
        bankAccount.deposit(accountHolder.getId(), generalDeposit);
        bankAccount.withdraw(wrongUserId, generalWithdraw);
        assertEquals(expectedBalance, bankAccount.getBalance());
    }
}
