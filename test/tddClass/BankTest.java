package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
	private Bank gtBank;

	@BeforeEach
	public void setUp(){
		gtBank = new Bank("GtBank", 10);
	}
	@Test
	public void createBankTest() {
		assertNotNull(gtBank);
		assertEquals("GtBank", gtBank.getName());
		assertEquals(10,gtBank.getMaximumNoOfCustomer());
	}

	@Test
	public void bankCanCreateAccountTest(){
		gtBank.createAccountFor("Saheed","Osupa", "1234");
		gtBank.createAccountFor("Saheed","Osupa", "1234");
		assertEquals(2,gtBank.getNumberOfCustomers());
	}

	@Test
	public void createAccountCheckForFirstCustomerTest(){
		gtBank.createAccountFor("Saheed","Osupa", "1234");
		gtBank.createAccountFor("Seyi","Banjo", "1234");
		gtBank.createAccountFor("Tola","Ruth", "1234");
		gtBank.createAccountFor("Foal","Mic", "1234");
		gtBank.createAccountFor("Taiwo","Taye", "1234");
		assertEquals(5,gtBank.getNumberOfCustomers());

//		Account account = gtBank.findAccount(1);
//		assertEquals(account.getAccountName());
//		assertEquals("5", account.getAccountNumber());
	}

}