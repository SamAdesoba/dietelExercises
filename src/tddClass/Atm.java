package tddClass;

import java.util.Scanner;

public class Atm {
	private static final Scanner scanner = new Scanner(System.in);
	private static final Bank zuBank = new Bank("zuBank", 20);
	public static void main (String[] args) {
		runApp();

	}

	private static void runApp() {
		String prompt = """
                Welcome to ZuBank,
                Press Softly
                1 -> To create account.
                2 -> To deposit.
                3 -> To withdraw.
                4 -> To send money.
                5 -> To check Balance.
                6 -> To exit.
                """;
		System.out.println(prompt);
		String userResponse = scanner.nextLine();
		switch (userResponse) {
			case "1" -> createAccount();
			case "2" -> deposit();
			case "3" -> withdrawal();
			case "4" -> transfer();
			case "5" -> checkBalance();
			case "6" -> exit();
			default -> runApp();
		}
	}

	private static void exit() {
		System.exit(0);
	}

	private static void checkBalance() {
		System.out.println("Enter your account number");
		String accountNumber = scanner.nextLine();
		System.out.println("Enter your pin");
		String pin = scanner.next();

		Account account = zuBank.findAccount(Integer.parseInt(accountNumber));
		System.out.println();
		System.out.println("Balance is " + account.getBalance(pin));
		System.out.println();
		scanner.next();
		runApp();
		System.out.println();

	}

	private static void transfer() {
		System.out.println("Wetin be ya account number biko");
		String senderAccountNumber = scanner.nextLine();
		System.out.println("Babe's which account");
		String receiverAccountNumber = scanner.nextLine();
		System.out.println("ya needle");
		String pin = scanner.next();
		System.out.println("How mush");
		int amount = scanner.nextInt();

		zuBank.transfer(amount, senderAccountNumber, receiverAccountNumber, pin);
		Account account = zuBank.findAccount(Integer.parseInt(senderAccountNumber));

		System.out.println();
		System.out.println(account);
		System.out.println();
		scanner.next();
		runApp();
	}

	private static void withdrawal() {
		System.out.println("Which account");
		String accountNumber = scanner.nextLine();
		System.out.println("Wey needle");
		String pin = scanner.next();
		System.out.println("How mush");
		int amount = scanner.nextInt();
		zuBank.withdraw(amount, accountNumber, pin);

		System.out.println("Success!!!");
		Account account = zuBank.findAccount(Integer.parseInt(accountNumber));
		System.out.println();
		System.out.println("New balance is " + account.getBalance(pin));
		System.out.println();
		scanner.next();
		runApp();
	}

	private static void deposit() {
		System.out.println("Which account");
		String accountNumber = scanner.nextLine();
		Account account = zuBank.findAccount(Integer.parseInt(accountNumber));
		System.out.println("The name is " + account.getAccountName());
		System.out.println("How much");
		int amount = scanner.nextInt();
		zuBank.deposit(amount, accountNumber);

		System.out.println();
		System.out.println(account);
		System.out.println();
		scanner.next();
		runApp();

	}

	private static void createAccount() {
		System.out.println("Enter first name");
		String firstName = scanner.nextLine();
		System.out.println("Enter your last name");
		String lastName = scanner.nextLine();
		System.out.println("Enter your pin");
		String pin = scanner.nextLine();
		System.out.println();
		System.out.println();
		Account savedAccount =zuBank.createAccountFor(firstName,lastName,pin);
		System.out.println(savedAccount);
		System.out.println();
		System.out.println();
		scanner.next();
		runApp();
	}

}
