package tddClass;

public class Bank {
	private String name;
	private Account[] accounts;
	private int numberOfCustomers;
	public Bank(String bankName, int numberOfCustomers){
		name = bankName;
		accounts = new Account[numberOfCustomers];

	}

	public String getName() {
		return name;
	}

	public int getMaximumNoOfCustomer() {
		return accounts.length;
	}

	public void createAccountFor(String lastName, String firstName, String pin) {
		String accountNumber = (numberOfCustomers+1)+"";
		Account account = new Account(accountNumber,firstName,lastName,pin);
//		account[numberOfCustomers] = account;
//		numberOfCustomers+;
	}

	public int getNumberOfCustomers() {

		return numberOfCustomers;
	}

	public Account findAccount(int accountNumber) {

		return accounts[accountNumber-1];
	}
}
