package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class AccountTest {
	private Account account;

	@BeforeEach
	public void startEachWith(){
		account = new Account("123447", "Adesoba", "Samson", "1234");
	}

    @Test
    public void accountCanBeCreatedTest(){
        assertNotNull(account);
    }
	 @Test
	 public void accountCanBeCreatedWithAccountNumber(){
		assertEquals("123447", account.getAccountNumber());
	}

	@Test
	public void accountCanBeCreatedWithAccountName(){
		assertEquals("Adesoba"+"Samson", account.getAccountName());
	}

	@Test
	public void accountCanBeCreatedWithAccountPin(){
		assertEquals("1234", account.getAccountPin());
	}


	@Test
    public void depositTest() {
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }

	@Test
	public void doubleDepositTest() {
		account.deposit(100);
		account.deposit(500);
		assertEquals(600, account.getBalance());
	}

	@Test
	public void negativeDepositTest() {
		account.deposit(500);
		account.deposit(-200);
		assertEquals(500, account.getBalance());
	}

	@Test
	public void withdrawWithPin(){
		account.deposit(1000);
		account.withdraw(500, "1234");
		assertEquals(500,account.getBalance());
	}

	@Test
	public void doubleWithdrawWithPin(){
		account.deposit(1000);
		account.withdraw(500, "1234");
		account.withdraw(300, "1234");
		assertEquals(200,account.getBalance());
	}

	@Test
	public void withdrawWithWrongPin(){
		account.deposit(1000);
		account.withdraw(500, "1235");
		assertEquals(1000,account.getBalance());
	}

	@Test
	public void negativeWithdrawWithPin(){
		account.deposit(1000);
		account.withdraw(1200, "1235");
		assertEquals(1000,account.getBalance());
	}


}
