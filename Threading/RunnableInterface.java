// Thread by implementing Runnable interface
class Calc implements Runnable {
  public void run() {
      System.out.println("Calculation Thread Started...");
      for (int i = 0; i < 5; i++) {
          System.out.println("Calculating: " + i);
      }
      System.out.println("Calculation Thread Ended.");
  }
}

class praveen implements Runnable{
  public void run(){
    System.out.println("Praveen Thread Started...");
  }
  
}

// Another thread class implementing Runnable
class Message implements Runnable {
  public void run() {
      System.out.println("Message Thread Started...");
      for (int i = 0; i < 5; i++) {
          System.out.println("Sending Message: " + i);
      }
      System.out.println("Message Thread Ended.");
  }

}

public class RunnableInterface {
  public static void main(String[] args) {
      System.out.println("Main Thread Started...");

      // Creating Runnable instances
      Calc calcRunnable = new Calc();
      Message messageRunnable = new Message();
      praveen praveenRunnable = new praveen();
      // Creating Thread objects and passing Runnable instances
      Thread t1 = new Thread(calcRunnable);
      Thread t2 = new Thread(messageRunnable);
      Thread t3 = new Thread(praveenRunnable);

      // Starting threads
      t1.start();
      t2.start();
      t3.start();

      System.out.println("Main Thread Ended.");
  }
}
