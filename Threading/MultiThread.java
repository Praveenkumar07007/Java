public class MultiThread {
  public static void main(String[] args) {
    System.out.println("main thread");
    MyThread obj = new MyThread();
    obj.start();
  }
}

class MyThread extends Thread{
  public void run(){
    System.out.println("MyThread");
  }
}
