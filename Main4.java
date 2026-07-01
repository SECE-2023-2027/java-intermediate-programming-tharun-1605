import java.util.Scanner;

class Vehicle {
    String startEngine() {
        return "Vehicle engine started";
    }
}

class Car extends Vehicle {
    @Override
    String startEngine() {
        return "Car engine roars";
    }
}

class Motorcycle extends Vehicle {
    @Override
    String startEngine() {
        return "Motorcycle engine revs";
    }
}

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle[] vehicles = new Vehicle[2];

        System.out.println("Enter vehicle type (Car/Motorcycle):");
        String type1 = sc.nextLine();

        System.out.println("Enter vehicle type (Car/Motorcycle):");
        String type2 = sc.nextLine();

        if (type1.equalsIgnoreCase("Car")) {
            vehicles[0] = new Car();
        } else {
            vehicles[0] = new Motorcycle();
        }

        if (type2.equalsIgnoreCase("Car")) {
            vehicles[1] = new Car();
        } else {
            vehicles[1] = new Motorcycle();
        }

        for (Vehicle v : vehicles) {
            System.out.println(v.startEngine());
        }

        sc.close();
    }
}