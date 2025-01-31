interface Car{
  void drive();
}
// lambda expression -> we can use it to implement functional interface it will only work with functional interface
public class LambdaExpression {
  public static void main(String[] args) {
    Car obj = () ->{
      System.out.println("Driving");
    };
    obj.drive();
  }
}
