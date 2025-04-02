import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double balance;
    private int pin;

    public BankAccount(String accountNumber, double initialBalance, int pin) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.pin = pin;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount, int enteredPin) {
        if (enteredPin == pin) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount + ". Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        } else {
            System.out.println("Incorrect PIN! Access denied.");
        }
    }

    public void checkBalance(int enteredPin) {
        if (enteredPin == pin) {
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Incorrect PIN! Cannot display balance.");
        }
    }
}


public class encapsulation_3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);



        BankAccount myAccount = new BankAccount("123456789",2000.2,1234);

        
        System.out.println("1: deposit ");
        System.out.println("2: withdraw ");
        System.out.println("3: balance ");

        int check = sc.nextInt();

        if (check==1){
            System.out.print("enter deposit amount : ");
            double depamo = sc.nextDouble();
            myAccount.deposit(depamo);
        }

        else if(check==2){
            System.out.print("enter withdraw amount : ");
            double witamo = sc.nextDouble();

            System.out.print("enter pin : ");
            int wpin = sc.nextInt();
            myAccount.withdraw(witamo, wpin);
        }

        else if(check==3){
            System.out.print("enter pin : ");
            int pin = sc.nextInt(); 
            myAccount.checkBalance(pin);
        }

        else{
            System.out.println("invalid option");
        }
    }
}
