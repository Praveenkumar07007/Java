class A{
  public void show(){
    System.out.println("Hello");
  }
  class B{ // inner - member , static , local , anonymous
    public void display(){
      System.out.println("Hello");
    }
  }
}
// member inner class -> we can access it using object of outer class -> A.B obj2 = obj.new B();  
// static inner class -> we can access it using class name -> A.B obj2 = new A.B();
// local inner class -> we can access it using method -> A.B obj2 = new A().new B();
// anonymous inner class -> we can access it using interface name -> A.B obj2 = new A().new B();
// functional interface -> only one abstract method
// use case we can store person address in person class as inner class bcoz address has diffrent data like city , state , country etc

public class InnerClass {
  public static void main(String[] args) {
    A obj = new A();
    obj.show();
    A.B obj2 = obj.new B();
    obj2.display();
  }
}
