// Interface (Common behavior for all devices)
interface Computer {
  void compileCode();  // Abstract method (No body)
}

// Implementing the interface in Laptop
class Laptop implements Computer {
  public void compileCode() {
      System.out.println("Got 5 errors");
  }
}

// Implementing the interface in Desktop
class Desktop implements Computer {
  public void compileCode() {
      System.out.println("Compilation is faster");
  }
}

// Developer now depends on the Interface (not a specific class)
class Developer {
  public void buildApp(Computer obj) {  // ✅ Works for any Computer type
      System.out.println("Building App...");
      obj.compileCode();
  }
}

// Main Class
public class Solution {
  public static void main(String[] args) {
      Laptop lap = new Laptop();
      Desktop desk = new Desktop();

      Developer dev = new Developer();

      dev.buildApp(lap);   // Works with Laptop
      dev.buildApp(desk);  // Works with Desktop
  }
}
