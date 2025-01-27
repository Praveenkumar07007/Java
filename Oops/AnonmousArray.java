 class Calc{
  public Calc(){
    System.out.println("Anonymous Array is created");
  }
  public void cal(){
    System.out.println("Anonymous Array is calling you");
  }
}


public class AnonmousArray {
  public static void main(String[] args) {
    System.out.println("Anonymous Array");
    Calc obj = new Calc();
    obj.cal();
  }
}
