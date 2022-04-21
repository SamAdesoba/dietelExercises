package tddClass;

public class Account {
	private final String ACCOUNT_NUMBER;
	private final String accountName;
	private final String pin;
	private int balance = 0;

	public Account(String accountNumber, String lastName, String firstName, String pin) {
		ACCOUNT_NUMBER = accountNumber;
		this.accountName = lastName +" "+ firstName;
		this.pin = pin;

	}

	public String getAccountNumber() {

		return ACCOUNT_NUMBER;
	}

	public void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public int getBalance(String pin) {
		if(pin.equals(this.pin)) {
			return balance;
		}
		return 0;
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
			}else
				System.out.println("Withdrawal amount exceeded account balance.");
		}
	}

	@Override
	public String toString(){
		String toString = String.format("""
				Account Name:   %s
				Account Number: %s
				Balance:        %d
				  """,accountName,ACCOUNT_NUMBER,balance);
		return toString;
	}



}
