public class Static {
  static int age; // first execute
  static{ //second
    age = 10;
    System.out.println("Static block called");
    System.out.println("Age: " + age);
  }
  static void display(){
    System.out.println("Static method called");
  }
  public static void main(String args[]) {
    System.out.println("Main method called");
    display();
  }
}
