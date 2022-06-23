package CreditCard;

public interface CreditCardNumber {
	boolean isValid(int number);
	int sumOfDoubleEvenPlaces(int number);
	void getDigit(int number);
	int sumOfOddPlace(int number);
	boolean prefixMatched(int number, int d);
	int getSize(int d);
	int getPrefix(int number, int k);

	short displayCreditDigit();
}
