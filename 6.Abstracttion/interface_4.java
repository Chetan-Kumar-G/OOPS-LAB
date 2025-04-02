import java.util.Scanner;

interface OnlinePayment {
    void pay(double amount);
    void refund(double amount);
}

class CreditCard implements OnlinePayment {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }


    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to Credit Card.");
    }
}


class PayPal implements OnlinePayment {
   
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }

  
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to PayPal.");
    }
}


class UPI implements OnlinePayment {
    
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }

     public void refund(double amount) {
        System.out.println("Refunded " + amount + " to UPI.");
    }
}


public class interface_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Creditcard or Paypal or Upi-");
        String type = sc.nextLine();
        if (type.equalsIgnoreCase("creditcard")){
            OnlinePayment paymentMethod = new CreditCard();
            paymentMethod.pay(1000);
            paymentMethod.refund(500);
        }

        else if(type.equalsIgnoreCase("paypal"))
        {
            OnlinePayment paymentMethod = new PayPal();
            paymentMethod.pay(1000);
            paymentMethod.refund(500);
        }

        else if(type.equalsIgnoreCase("upi"))
        {
            OnlinePayment paymentMethod = new UPI();
            paymentMethod.pay(1000);
            paymentMethod.refund(500);
        }

        else{
            System.out.println("invalid type");
        }
        
    }
}
