package entities;

public class Account {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public Account(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}
	
	public Account(int accountNumber, String accountHoulder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHoulder;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void AccountHolder(String accountHonder) {
		this.accountHolder = accountHonder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double deposit) {
		balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		if (withdraw == 0) {
			balance = balance - withdraw;
		} else {
			balance = balance - withdraw - 5;
		}
	}
	
	public String toString() {
		return "Account "
			+ getAccountNumber()
			+ ", Holder: "
			+ getAccountHolder()
			+ String.format(", Balance: $ %.2f%n", getBalance());
	}
}
