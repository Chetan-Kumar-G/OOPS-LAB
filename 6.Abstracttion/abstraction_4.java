import java.util.Scanner;

abstract class FoodItem {
    String name;
    double price;


    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println(name + "price-" +price);
    }

    abstract void prepare();
}


class Pizza extends FoodItem {
    public Pizza(double price) {
        super("Pizza", price);
    }

    void prepare() {
        System.out.println("Preparing Pizza: baking dough, adding toppings, and baking again.");
    }
}


class Burger extends FoodItem {
    public Burger(double price) {
        super("Burger", price);
    }

    void prepare() {
        System.out.println("Preparing Burger: grilling patty, assembling with bun and toppings.");
    }
}


class IceCream extends FoodItem {
    public IceCream(double price) {
        super("Ice Cream", price);
    }


    void prepare() {
        System.out.println("Preparing Ice Cream: freezing mixture and adding flavors.");
    }
}

public class abstraction_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pp = sc.nextDouble();
        double bp = sc.nextDouble();
        double ip = sc.nextDouble();

        FoodItem pizza = new Pizza(pp);
        pizza.prepare();
        FoodItem burger = new Burger(bp);
        burger.prepare();
        FoodItem icecream = new IceCream(ip);
        icecream.prepare();

    }
}
