import java.util.*;

class Vehicle{
    String model;
    int year;
    int speed;
    Vehicle(String model,int year,int speed){
        this.model=model;
        this.year=year;
        this.speed=speed;
    }

    void displayInfo(){
        System.out.println("model="+" "+model);
        System.out.println("year="+" "+year);
        System.out.println("speed="+" "+speed);
    }
}

class car extends Vehicle{
    String fuelType;

    car(String fuelType,String model,int year,int speed){
        super(model,year,speed);
        this.fuelType=fuelType;
    }

    void displayInfoFuel(){
        System.out.println("fuelType="+" "+fuelType);
    }
}

public class singleInheritance_1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter model");
        String model=sc.nextLine();
        System.out.print("enter year");
        int year=sc.nextInt();
        System.out.print("enter speed");
        int speed=sc.nextInt();
        sc.nextLine();
        String fuelType=sc.nextLine();

        car obj = new car(fuelType,model,year,speed);
        obj.displayInfo();
        obj.displayInfoFuel();
    }
}

