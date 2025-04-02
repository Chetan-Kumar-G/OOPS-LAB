abstract class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    
    abstract void withdraw(double amount);
}


class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    
    void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". Remaining balance: " + balance);
        } else {
            System.out.println("Withdrawal denied! Minimum balance of 1000 must be maintained.");
        }
    }
}


class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}


public class abstraction_3 {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA12345", 5000);
        BankAccount current = new CurrentAccount("CA67890", 10000);

        savings.deposit(2000);
        savings.withdraw(6000); 
        savings.withdraw(2000); 

        current.withdraw(5000); 
        current.withdraw(6000); 
    }
}
