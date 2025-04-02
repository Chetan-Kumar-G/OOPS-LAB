import java.util.Scanner;

class Vehicle {
    String brand;

    Vehicle(String brand){
        this.brand=brand;
    }

    void displayInfo(){
        System.out.println("brand - "+brand);
    }

    void start() {
        System.out.println("Vehicle is starting...");
    }
}


class Car extends Vehicle {
    String fueltype ;

    Car(String brand,String fueltype){
        super(brand);
        this.fueltype=fueltype;
    }

    void displayFuelInfo(){
        System.out.println("Fuel Type - "+fueltype);
    }
    void drive() {
        System.out.println("Car is driving...");
    }
}


class Sedan extends Car {
    int trunksize;

    Sedan(String brand,String fueltype,int trunksize){
        super(brand, fueltype);
        this.trunksize=trunksize;
    }

    void sedanFeatures() {
        displayInfo();
        displayFuelInfo();
        start();
        drive();
        System.out.println("Sedan: Comfortable and fuel-efficient");
        System.out.println("Trunk Size: " + trunksize + " liters");
    }
}


class SUV extends Car {
    double groundClearance;

    SUV(String brand,String fueltype,double groundClearance){
        super(brand, fueltype);
        this.groundClearance=groundClearance;
    }

    void suvFeatures() {
        displayInfo();
        displayFuelInfo();
        start();
        drive();
        System.out.println("SUV: Powerful and spacious");
        System.out.println("Ground Clearance: " + groundClearance + " mm");
    }
}

public class hybridInheritance_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand = sc.nextLine();
        String fueltype = sc.nextLine();
        double groundClearance=sc.nextDouble();
        int trunksize=sc.nextInt();
        Sedan se = new Sedan(brand,fueltype,trunksize);
        se.sedanFeatures();

        System.out.println("---------------------SUV-------------------");
        SUV su = new SUV(brand,fueltype,groundClearance);
        su.suvFeatures();
    }
}
