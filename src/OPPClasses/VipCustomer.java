package OPPClasses;

public class VipCustomer {
	private String name;
	private double creditLimit;
	private String emailAddress;

	public VipCustomer() {
		this("Sam", 564.5, "Ade");
	}

	public VipCustomer(String name, double creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}

	public VipCustomer(String name, String emailAddress) {
		this(name,5.2, emailAddress);
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
}
