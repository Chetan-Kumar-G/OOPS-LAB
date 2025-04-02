import java.util.*;

class Bank{
    String bankname;

    Bank(String bankname){
        this.bankname=bankname;
    }

    void bankDetails(){
        System.out.println("Bank Name - "+bankname);
    }
}

class branch extends Bank{
    String branchLocation;
    
    branch(String bankname,String bankLocation){
        super(bankname);
        this.branchLocation=bankLocation;
    }

    void branchLocation(){
        bankDetails();
        System.out.println("Branch Location - "+branchLocation);
    }
}

class savingAccount extends branch{
    double minBalance;

    savingAccount(String bankname,String bankLocation,double minBalance){
        super(bankname, bankLocation);
        this.minBalance=minBalance;
    }

    void accountType(){
        branchLocation();
        System.out.println("Minimunm Balance - "+ minBalance);
    }
}

class currentAccount extends branch{
    double overDraftLimit;

    currentAccount(String bankname,String bankLocation,double overDraftLimit){
        super(bankname, bankLocation);
        this.overDraftLimit=overDraftLimit;
    }

    void accountType(){
        branchLocation();
        System.out.println("Over Draft Limit - "+ overDraftLimit);
    }
}

public class hybridInheritance_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter bank name -");
        String name= sc.nextLine();
        System.out.print("enter bank location -");
        String address=sc.nextLine();
        System.out.print("enter minimum balance -");
        double minbal=sc.nextDouble();
        System.out.print("enter overdraft limit -");
        double overdraft=sc.nextDouble();
        savingAccount sa = new savingAccount(name,address,minbal);
        sa.accountType();
        System.out.println("------------------current account----------------");
        currentAccount ca = new currentAccount(name,address,overdraft);
        ca.accountType();
    }
}