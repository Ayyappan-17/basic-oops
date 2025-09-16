package inheritance;

// ===== Superclass =====
class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// ===== Single Inheritance =====
class Car extends Vehicle {
    int doors;

    Car(String brand, int doors) {
        super(brand); // Call parent constructor
        this.doors = doors;
    }

    void displayCarInfo() {
        displayBrand(); // Inherited method
        System.out.println("Doors: " + doors);
    }
}

// ===== Multilevel Inheritance =====
class SportsCar extends Car {
    int topSpeed;

    SportsCar(String brand, int doors, int topSpeed) {
        super(brand, doors);
        this.topSpeed = topSpeed;
    }

    void displaySportsCarInfo() {
        displayCarInfo(); // Inherited method
        System.out.println("Top Speed: " + topSpeed + " km/h");
    }
}

// ===== Hierarchical Inheritance =====
class Bike extends Vehicle {
    boolean hasCarrier;

    Bike(String brand, boolean hasCarrier) {
        super(brand);
        this.hasCarrier = hasCarrier;
    }

    void displayBikeInfo() {
        displayBrand(); // Inherited method
        System.out.println("Has Carrier: " + hasCarrier);
    }
}

// ===== Main Class =====
public class Main {
    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("=== Single Inheritance ===");
        Car myCar = new Car("Toyota", 4);
        myCar.displayCarInfo();

        // Multilevel Inheritance
        System.out.println("\n=== Multilevel Inheritance ===");
        SportsCar ferrari = new SportsCar("Ferrari", 2, 350);
        ferrari.displaySportsCarInfo();

        // Hierarchical Inheritance
        System.out.println("\n=== Hierarchical Inheritance ===");
        Bike myBike = new Bike("Yamaha", true);
        myBike.displayBikeInfo();
    }
}
