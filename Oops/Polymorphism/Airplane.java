// class AeroPlane1 {
//   void takeOff() {
//       System.out.println("AeroPlane is taking off");
//   }
//   void fly() {
//       System.out.println("AeroPlane is flying");
//   }
// }

// class CargoPlane1 extends AeroPlane1 {
//   void fly() {
//       System.out.println("CargoPlane flies at lower altitude");
//   }
// }

// class PassengerPlane1 extends AeroPlane1 {
//   void fly() {
//       System.out.println("PassengerPlane flies at medium altitude");
//   }
// }

// public class Airplane {
//   public static void main(String[] args) {
//       CargoPlane1 cp = new CargoPlane1();
//       PassengerPlane1 pp = new PassengerPlane1();
//       AeroPlane1 ref;  // Parent class ka reference

//       ref = cp;  // Polymorphism: Parent class ka reference child object ko hold kar raha hai
//       ref.takeOff();
//       ref.fly();

//       System.out.println("-----------------");

//       ref = pp;  // Ab same parent reference doosre child class ke object ko hold kar raha hai
//       ref.takeOff();
//       ref.fly();

//       // pp = cp;  ❌ NOT POSSIBLE!
//       // Do alag-alag sibling classes ke objects directly assign nahi ho sakte
//   }
// }


// Parent Class
class AeroPlane1 {
  void takeOff() {
      System.out.println("AeroPlane is taking off");
  }
  void fly() {
      System.out.println("AeroPlane is flying");
  }
}

// Child Class 1
class CargoPlane1 extends AeroPlane1 {
  void fly() {
      System.out.println("CargoPlane flies at lower altitude");
  }
}

// Child Class 2
class PassengerPlane1 extends AeroPlane1 {
  void fly() {
      System.out.println("PassengerPlane flies at medium altitude");
  }
}

// Another Class Accepting Parent Reference
class Airport {
  // Parent class reference as a parameter
  void permitPlane(AeroPlane1 ref) {
      ref.takeOff();
      ref.fly();
      System.out.println("-----------------");
  }
}

// Main Class
public class Airplane {
  public static void main(String[] args) {
      CargoPlane1 cp = new CargoPlane1();
      PassengerPlane1 pp = new PassengerPlane1();

      Airport airport = new Airport();

      // Passing different child class objects
      airport.permitPlane(cp);  // Calls CargoPlane's fly() method
      airport.permitPlane(pp);  // Calls PassengerPlane's fly() method
  }
}
