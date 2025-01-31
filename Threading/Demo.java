public class Demo {
  public static void main(String[] args) {
    System.out.println("main thread");
    System.out.println("Before changing the name and priority");
    String name = Thread.currentThread().getName();
    System.out.println(name);
    System.out.println(Thread.currentThread().getPriority());
    System.out.println("After changing the name and priority");
    Thread t = Thread.currentThread();
    t.setName("Praveen");
    t.setPriority(10);
    System.out.println(t.getName());
    System.out.println(t.getPriority());
  }
}

