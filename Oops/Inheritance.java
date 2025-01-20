// Base class
class Inheritance {
    String brand;
    int year;

    // Constructor for Vehicle
    Inheritance(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method in Vehicle class
    void start() {
        System.out.println(brand + " is starting!");
    }

    void displayDetails() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

// Derived class
class Car extends Inheritance {
    int numDoors;

    // Constructor for Car
    Car(String brand, int year, int numDoors) {
        super(brand, year); // Call the constructor of the Vehicle class
        this.numDoors = numDoors;
    }

    // Method in Car class
    void honk() {
        System.out.println(brand + " says: Beep beep!");
    }

    void showCarDetails() {
        displayDetails(); // Call the method from the Vehicle class
        System.out.println("Number of doors: " + numDoors);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", 2022, 4);

        // Call methods from the Vehicle class
        myCar.start();
        myCar.displayDetails();

        // Call methods from the Car class
        myCar.honk();
        myCar.showCarDetails();
    }
}
