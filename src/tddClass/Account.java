package tddClass;

public class Account {
	private final String ACCOUNT_NUMBER;
	private  String accountName;
	private  String pin;
	private int balance = 0;

	public Account(String accountNumber, String lastName, String firstName, String pin) {
		ACCOUNT_NUMBER = accountNumber;
		this.accountName = lastName + firstName;
		this.pin = pin;

	}

	public String getAccountNumber() {
		return ACCOUNT_NUMBER;
	}

	public void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
		}else balance = this.balance;
	}

	public int getBalance() {
		return balance;
	}

	public String getAccountName() {
		return accountName;
	}

	public String getAccountPin() {
		return pin;
	}

	public void withdraw(int amount, String pin) {
		if(pin.equals(this.pin)){
			if(amount < balance) {
				balance -= amount;
			}
		}
	}
}
