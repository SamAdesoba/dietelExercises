package CreditCard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest extends CreditCard {
	private CreditCardNumber creditCardNumber;
	@BeforeEach
	void setUp() {
		creditCardNumber = new CreditCard();
	}

	@Test
	void testIsValidCreditCard() {
		creditCardNumber.getDigit(987654321);
		assertEquals(987654321, creditCardNumber.displayCreditDigit());
	}

	@Test
	void testSumOfDoubleEvenPlaces() {
	}

	@Test
	void testGetDigit() {
	}

	@Test
	void testSumOfOddPlace() {
	}

	@Test
	void testPrefixMatched() {
	}

	@Test
	void testGetSize() {
	}

	@Test
	void testGetPrefix() {
	}
}