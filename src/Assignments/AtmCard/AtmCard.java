package Assignments.AtmCard;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

import static Assignments.AtmCard.CardType.*;

public class AtmCard {
	private StringBuilder cardNumber;
	private static CardType cardType;
	private String userFirstName;
	private String userLastName;
	private String userOtherName;
	private String bankName;
	private StringBuilder cvv;

	private SecureRandom random = new SecureRandom();
	private Scanner read = new Scanner(System.in);


	public AtmCard(String userFirstName, String userLastName, String userOtherName, String bankName, CardType cardType) {
		if (cardType.equals(MASTER_CARD)){
			this.cardNumber = generateCardNumberForMasterCards();
			this.cardType = getMasterCard();
		} else if (cardType.equals(VISA_CARD)) {
			this.cardNumber = generateCardNumberForVisaCards();
			this.cardType = getVisaCard();
		} else if (cardType.equals(CardType.VERVE)) {
			this.cardNumber = generateCardNumberForVerveCards();
			this.cardType = getVerveCard();
		}
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userOtherName = userOtherName;
		this.bankName = bankName;
		this.cvv = getCvv();
	}

	private CardType getVerveCard() {
		return VERVE;
	}

	private CardType getVisaCard() {
		return VISA_CARD;
	}

	private CardType getMasterCard() {
		return MASTER_CARD;
	}

	private StringBuilder getCvv() {
		StringBuilder cvv = new StringBuilder();
		Random random = new Random();
		int[] digits = new int[3];
		for (int i = 0; i < digits.length; i++) {
			digits[i] = random.nextInt(10);
			cvv.append(digits[i]);
		}
		return cvv;
	}

	public static StringBuilder generateCardNumberForMasterCards() {
		StringBuilder cardNumber = new StringBuilder();
		Random random = new Random();
		char[] digits = new char[19];
			digits[0] = '5';
			digits[1] = '3';
			digits[2] = '9';
			digits[3] = '9';
			digits[4] = ' ';
			digits[9] = ' ';
			digits[14] = ' ';
		generateOtherDigits(random, digits, cardNumber);
		return cardNumber;
	}

	public static StringBuilder generateCardNumberForVerveCards() {
		StringBuilder cardNumber = new StringBuilder();
		Random random = new Random();
		char[] digits = new char[19];
		digits[0] = '5';
		digits[1] = '0';
		digits[2] = '6';
		digits[3] = '1';
		digits[4] = ' ';
		digits[9] = ' ';
		digits[14] = ' ';
		generateOtherDigits(random, digits, cardNumber);
		return cardNumber;
	}

	public static StringBuilder generateCardNumberForVisaCards() {
		StringBuilder cardNumber = new StringBuilder();
		Random random = new Random();
		char[] digits = new char[19];
		digits[0] = '4';
		digits[1] = '1';
		digits[2] = '8';
		digits[3] = '7';
		digits[4] = ' ';
		digits[9] = ' ';
		digits[14] = ' ';
		generateOtherDigits(random, digits, cardNumber);
		return cardNumber;
	}

	private static void generateOtherDigits(Random random, char[] digits, StringBuilder cardNumber) {
		for (int i = 5; i < 9; i++) {
			digits[i] = (char) (random.nextInt(10) + '0');
		}
		for (int i = 10; i < 14; i++) {
			digits[i] = (char) (random.nextInt(10) + '0');
		}
		for (int i = 15; i < 19; i++) {
			digits[i] = (char) (random.nextInt(10) + '0');
		}
		for (char c : digits) {
			cardNumber.append(c);
		}
	}

	public void getCardDetails() {
		System.out.println("Card Number is " + cardNumber);
		System.out.println("Card Type is " + cardType);
		System.out.println("User Full name is " + getFullName());
		System.out.println("Bank name is " + getBankName());
		System.out.println("Card cvv is " + cvv);
	}

	public String getFullName() {
		return getUserFirstName() + " " + getUserOtherName() + " " + getUserLastName();
	}

	public StringBuilder getCardNumber() {
		return cardNumber;
	}


	public String getUserFirstName() {
		return userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public String getUserOtherName() {
		return userOtherName;
	}

	public String getBankName() {
		return bankName;
	}

	public void validateCardType(){
		System.out.println("Please enter the first four digits of your card: ");
		int number = read.nextInt();
		int fourDigit = number	 % 10;
		int thirdDigit = (number % 100) / 10;
		int secondDigit = (number % 1000) / 100;
		int firstDigit = number / 1000;
		validateMasterCard(fourDigit, thirdDigit, secondDigit, firstDigit);
		validateVisaCard(fourDigit, thirdDigit, secondDigit, firstDigit);
		validateVerveCard(fourDigit, thirdDigit, secondDigit, firstDigit);
	}

	private static void validateMasterCard(int fourDigit, int thirdDigit, int secondDigit, int firstDigit) {
		if (firstDigit == 5 && secondDigit == 3 && thirdDigit == 9 && fourDigit == 9){
			System.out.println("The card you enter is a master card");
		}
	}

	private static void validateVerveCard(int fourDigit, int thirdDigit, int secondDigit, int firstDigit) {
		if (firstDigit == 5 && secondDigit == 0 && thirdDigit == 6 && fourDigit == 1){
			System.out.println("The card you enter is a verve card");
		}
	}

	private static void validateVisaCard(int fourDigit, int thirdDigit, int secondDigit, int firstDigit) {
		if (firstDigit == 4 && secondDigit == 1 && thirdDigit == 8 && fourDigit == 7){
			System.out.println("The card you enter is a visa card");
		}
	}
}
