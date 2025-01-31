class Laptop {
  public void compileCode() {
      System.out.println("Got 5 errors");
  }
}

class Desktop {
  public void compileCode() {
      System.out.println("Compilation is faster");
  }
}

class Developer {
  public void buildApp(Laptop obj) {  // ❌ Only works for Laptop
      System.out.println("Building App...");
      obj.compileCode();
  }
}

public class Problem {
  public static void main(String[] args) {
      Laptop lap = new Laptop();
      Developer dev = new Developer();
      dev.buildApp(lap);  // Works only for Laptop
  }
}
