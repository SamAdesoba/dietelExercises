//package tddClass;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.testng.annotations.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//public class EAccountTest {
//	private EAccount account;
//	@BeforeEach
//	public void sam(){
//		account = new EAccount("123447","Florence", "funmi", "1234");
//	}
//	@Test
//	public void accountCanBeCreatedTest(){
//		assertNotNull(account);
//	}

//	@Test
//	public void accountCanBeCreatedWithDetails(){
//		assertEquals("123447",account.getAccountNumber());
//	}
//
//	@Test
//	public void accountCreateFullName(){
//		assertEquals("Florence"+" "+"funmi",account.getFullName());
//	}
//
//	@Test
//	public void accountWithdrawWithWrongPinTest(){
//		account.deposit(1200);
//		account.withdraw(200,"1234");
//		assertEquals(1200,account.getbalance("1234"));
//	}


//}
