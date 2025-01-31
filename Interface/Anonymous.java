interface Car{
  void drive();
}

// class Audi implements Car{
//   public void drive(){
//     System.out.println("Driving");
//   }
// }

public class Anonymous {
  public static void main(String[] args) {
    Car obj = new Car(){   // anonymous inner class -> we can use this class only once
      public void drive(){
        System.out.println("Driving");
      }
    };
    obj.drive();
  }
}
