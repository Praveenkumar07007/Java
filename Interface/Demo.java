interface A{
  int num = 10;
  void display();
}

public class Demo {
  public static void main(String args[]){
    System.out.println(A.num);
   // A.num = 9;  ❌ Compilation Error: Cannot assign a value to final, static, public variable 'num'

  }
}
