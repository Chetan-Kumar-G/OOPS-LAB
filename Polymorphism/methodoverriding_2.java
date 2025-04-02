import java.util.Scanner;

class Vehicle {
    void calculateFare(int distance) {
        System.out.println("Calculating fare for " + distance + " km.");
    }
}

class Car extends Vehicle {
    @Override
    void calculateFare(int distance) {
        System.out.println("Car Fare: " + (distance * 10));
    }
}

class Bike extends Vehicle {
    @Override
    void calculateFare(int distance) {
        System.out.println("Bike Fare: " + (distance * 5));
    }
}

class Auto extends Vehicle {
    @Override
    void calculateFare(int distance) {
        System.out.println("Auto Fare: " + (distance * 7));
    }
}

public class methodoverriding_2{
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle auto = new Auto();
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        car.calculateFare(distance);
        bike.calculateFare(distance);
        auto.calculateFare(distance);
    }
}

