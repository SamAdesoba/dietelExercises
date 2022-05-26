package Assignments.EStore;

public class Customers extends Admin {

    private ShoppingCart cart;
    private BillingInformation bill;


    public Customers(int age, String email, String userName, ShoppingCart cart, BillingInformation bill) {
        super(age, email, userName);
        this.bill = bill;
        this.cart = cart;
    }
}
