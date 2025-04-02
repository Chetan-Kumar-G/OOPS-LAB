import java.text.ListFormat.Style;
import java.util.Scanner;

abstract class Vehicle {
    String fuelType;
    int speedLimit;

    public Vehicle(String fuelType, int speedLimit) {
        this.fuelType = fuelType;
        this.speedLimit = speedLimit;
    }

    abstract void startEngine();
}


class Car extends Vehicle {
    public Car(String fuelType,int speedLimit) {
        super(fuelType,speedLimit);
    }

    
    void startEngine() {
        System.out.println("Car engine started with " + fuelType + ". Speed limit: " + speedLimit + " km/h.");
    }
}


class Bike extends Vehicle {
    public Bike(String fuelType,int speedLimit) {
        super(fuelType,speedLimit);
    }

    
    void startEngine() {
        System.out.println("Bike engine started with " + fuelType + ". Speed limit: " + speedLimit + " km/h.");
    }
}


class Bus extends Vehicle {
    public Bus(String fuelType,int speedLimit) {
        super(fuelType,speedLimit);
    }

    
    void startEngine() {
        System.out.println("Bus engine started with " + fuelType + ". Speed limit: " + speedLimit + " km/h.");
    }
}


public class abstraction_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fuelType = sc.nextLine();
        int speedLimit=sc.nextInt();
        Vehicle[] vehicles = { new Car(fuelType,speedLimit), new Bike(fuelType,speedLimit), new Bus(fuelType,speedLimit) };
        for (Vehicle v : vehicles) {
            v.startEngine();
        }
    }
}
