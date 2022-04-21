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
	public void createAccountCheckForCustomerByAccountTest(){
		gtBank.createAccountFor("Saheed","Osupa", "1234");
		gtBank.createAccountFor("Seyi","Banjo", "1234");
		gtBank.createAccountFor("Tola","Ruth", "1234");
		gtBank.createAccountFor("Foal","Mic", "1234");
		gtBank.createAccountFor("Taiwo","Taye", "1234");
		assertEquals(5,gtBank.getNumberOfCustomers());

		Account account = gtBank.findAccount(2);
		assertEquals("Banjo Seyi",account.getAccountName());
		assertEquals("2", account.getAccountNumber());
	}

	@Test
	public void bankCanDepositMoneyTest(){
		gtBank.createAccountFor("Saheed","Osupa", "1234");
		gtBank.deposit(1200,"1");
		gtBank.deposit(1800,"1");

		Account account = gtBank.findAccount(1);
		assertEquals(3000, account.getBalance("1234"));

	}

	@Test
	public void bankCanWithdrawMoneyTest(){
		gtBank.createAccountFor("Saheed","Osupa", "1234");
		gtBank.deposit(1200,"1");
		gtBank.withdraw(1000,"1", "1234");

		Account account = gtBank.findAccount(1);
		assertEquals(200, account.getBalance("1234"));

	}


	@Test
	public void bankCanTransferMoneyTest(){
		gtBank.createAccountFor("Saheed","Osupa", "1111");
		gtBank.createAccountFor("Seyi","Banjo", "2222");


		gtBank.deposit(1200,"1");
		Account account = gtBank.findAccount(1);
		assertEquals(1200, account.getBalance("1111"));


		gtBank.transfer(200,"1","2","1111");

		account = gtBank.findAccount(1);
		assertEquals(1000, account.getBalance("1111"));

		account = gtBank.findAccount(2);
		assertEquals(200, account.getBalance("2222"));

	}






}