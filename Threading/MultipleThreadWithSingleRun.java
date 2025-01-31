// Thread by implementing Runnable interface
class Calc implements Runnable {
  public void run() {
      String name = Thread.currentThread().getName();

      if (name.equals("Calculation")) {
          important();
      } else if (name.equals("Message")) {
          message();
      }
  }

  public void important() {
      System.out.println("Calculation Thread Important.");
  }

  public void message() {
      System.out.println("Message Thread Started...");
      for (int i = 0; i < 5; i++) {
          System.out.println("Sending Message: " + i);
      }
      System.out.println("Message Thread Ended.");
  }
}

public class MultipleThreadWithSingleRun {
  public static void main(String[] args) {
      System.out.println("Main Thread Started...");

      // Creating Runnable instance
      Calc calcRunnable = new Calc();

      // Creating Thread objects and setting names
      Thread t1 = new Thread(calcRunnable);
      Thread t2 = new Thread(calcRunnable);

      t1.setName("Calculation"); // ✅ Setting correct name
      t2.setName("Message");      // ✅ Setting correct name

      // Starting threads
      t1.start();
      t2.start();
  }
}
