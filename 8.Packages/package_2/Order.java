package shopping.orders;

import shopping.products.Product;
import shopping.customers.Customer;

public class Order {
    public static void placeOrder(Customer customer, Product product) {
        System.out.println(customer.getName() + " ordered: " + product.getName() + " for $" + product.getPrice());
    }
}
