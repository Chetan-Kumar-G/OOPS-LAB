import java.util.*;

class order{
    int orderid;
    String discountCode;
    int price = 1000;

    void displayPrice(int orderid){
        System.out.println("you order id is "+orderid);
        System.out.println("your price is - "+price);
    }

    void displayPrice(int orderid,String discountCode){
        System.out.println("you order id is "+orderid);
        price = price-(price/2);
        System.out.println("your discount price is - "+price);
    }

}
public class methodoverloading_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String discountCode = sc.nextLine();
        int orderid = sc.nextInt();
        order o1 = new order();
        o1.displayPrice(orderid);

        System.out.println("second object");
        order o2 = new order();
        o2.displayPrice(orderid,discountCode);
        }
}
