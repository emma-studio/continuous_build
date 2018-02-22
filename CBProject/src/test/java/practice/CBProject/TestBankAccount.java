package practice.CBProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * Unit test for simple App.
 */
@RunWith(JUnitPlatform.class)
public class TestBankAccount
{
    @DisplayName("Test BankAccount for Debit with sufficient balance")
    @Test
    public void testDebitWithSufficientBalance()
    {
	    BankAccount account = new BankAccount(100);
	    double amount = account.debit(40);
	    Assertions.assertEquals(40.0, amount);
    }
    
    @DisplayName("Test BankAccount for Debit with insufficient balance")
    @Test
    public void testDebitWithInsufficientBalance()
    {
    	BankAccount account = new BankAccount(100);
    	double amount = account.debit(200);
    	Assertions.assertEquals(100.0, amount);
    }
}
