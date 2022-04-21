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

	public Account createAccountFor(String lastName, String firstName, String pin) {
		String accountNumber = String.valueOf((numberOfCustomers+1));
		Account account = new Account(accountNumber,firstName,lastName,pin);
		accounts[numberOfCustomers] = account;
		numberOfCustomers++;
		return account;
	}

	public int getNumberOfCustomers() {

		return numberOfCustomers;
	}

	public Account findAccount(int accountNumber) {

		return accounts[accountNumber-1];
	}

	public void deposit(int amount, String accountNumber) {
		Account account = findAccount(Integer.parseInt(accountNumber));
		account.deposit(amount);
	}

	public void withdraw(int amount, String accountNumber, String pin) {
		Account account = findAccount(Integer.parseInt(accountNumber));
		account.withdraw(amount,pin);
	}

	public void transfer(int amount, String from, String to, String senderPin) {
		Account senderAccount = findAccount(Integer.parseInt(from));
		Account receiverAccount = findAccount(Integer.parseInt(to));

		senderAccount.withdraw(amount,senderPin);
		receiverAccount.deposit(amount);


	}
}
