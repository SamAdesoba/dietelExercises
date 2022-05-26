package Assignments.EStore;

public class Product {

    private String name;
    private int price;
    private int quantity;
    private String size;

    private ProductType product;

    public Product(String name, int price, int quantity, String size) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.size = size;
    }
}
