import java.util.Scanner;

class account{
    int accountNumber;
    double balance;
    String accountType;

    account(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
        System.out.println("accountnumber - "+accountNumber);
        System.out.println("balance - "+balance);
    }

    account(int accountNumber,double balance,String accountType){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.accountType=accountType;
        System.out.println("accountnumber - "+accountNumber);
        System.out.println("balance - "+balance);
        System.out.println("accountType - "+accountType);
    }
}
public class constructoroverloading_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String accountType= sc.nextLine();
        int accountNumber= sc.nextInt();
        double balance= sc.nextDouble();

        account obj1 = new account(accountNumber, balance);
        System.out.println("----------------overloading-------------------");
        account obj2 = new account(accountNumber, balance, accountType);
        
    }
    
}
