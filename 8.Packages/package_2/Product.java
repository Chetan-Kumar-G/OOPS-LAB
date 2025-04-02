package shopping.products;

public class Product {
    private int productID;
    private String name;
    private double price;

    public Product(int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Product ID: " + productID + ", Name: " + name + ", Price: $" + price);
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
