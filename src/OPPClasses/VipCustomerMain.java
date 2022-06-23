package OPPClasses;

public class VipCustomerMain {
	public static void main(String[] args) {
		VipCustomer customer1 = new VipCustomer("Adesoba",564.3, "samson");
		System.out.println(customer1.getCreditLimit());
		VipCustomer customer2 = new VipCustomer("Adesoba1", "samson2");
		System.out.println(customer2.getCreditLimit());
	}
}
