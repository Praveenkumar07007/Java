interface A{
  void show();
  default void config(){
    System.out.println("Config");
  }
  static void run(){
    System.out.println("Run");
  }
}

class B implements A {
  public void show(){
    System.out.println("Hello");
  }
}

public class Java8fe {

  public static void main(String[] args) {
    A.run();
  }
}
