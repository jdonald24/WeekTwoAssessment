package model;

/**
 * @author Austin Donald - ajdonald
 * CIS175 - Fall 2021
 * Sep 8, 2021
 */
public class BankAccount {
	private double balance;
	private double interestRate;
	private String accountType;
	public BankAccount() {
		
	}
	public BankAccount (double balance, double interestRate, String accountType) {
		setBalance(balance);
		setInterestRate(interestRate);
		setAccountType(accountType);
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * @return the interestRate
	 */
	public double getInterestRate() {
		return interestRate;
	}
	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double balanceAfterYears (int years) {
		double amount = 0;
		amount = 1+this.interestRate;
		amount = Math.pow(amount, years);
		amount = amount*balance;
		return amount;
	}
}
