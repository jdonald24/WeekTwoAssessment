package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.BankAccount;

/**
 * @author Austin Donald - ajdonald
 * CIS175 - Fall 2021
 * Sep 8, 2021
 */
public class BankAccountTest {
	BankAccount account = new BankAccount (5000, 0.1, "savings");
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIfBalanceNull() {
		assertNotNull(account.getBalance());
	}
	@Test
	public void testBalanceAfterYears() {
		double balance12 = 15692.14;
		assertEquals (balance12, account.balanceAfterYears(12), 0.01);
	}

}
