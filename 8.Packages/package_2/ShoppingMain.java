import shopping.products.Product;
import shopping.customers.Customer;
import shopping.orders.Order;

public class ShoppingMain {
    public static void main(String[] args) {
        Product p1 = new Product(201, "Laptop", 75000);
        Customer c1 = new Customer(101, "Amit Sharma");

        p1.displayProduct();
        Order.placeOrder(c1, p1);
    }
}
