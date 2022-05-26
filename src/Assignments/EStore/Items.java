package Assignments.EStore;

public class Items extends ShoppingCart {

    private String productName;
    private int quantityOfNumber;

    public Items(String productName, int quantityOfNumber) {
        this.productName = productName;
        this.quantityOfNumber = quantityOfNumber;
    }
}
