class Vehicle {
  String model;
  int year;

  Vehicle(String model, int year) {
      this.model = model;
      this.year = year;
  }
}

class Car extends Vehicle {
  String brand;

  Car(String model, int year, String brand) {
      super(model, year);
      this.brand = brand;
  }
}

public class Changing {
  public static void main(String[] args) {
      Car car = new Car("Mustang", 1969, "Ford");
      System.out.println(car.model + " " + car.year + " " + car.brand);
  }
}
