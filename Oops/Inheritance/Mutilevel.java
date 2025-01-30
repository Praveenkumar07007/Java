class Demo1{
  void display(){
    System.out.println("This is a display method of Demo1 class");
  }
}
class  Demo2 extends Demo1{
  
}
class Demo3 extends Demo2{

}

public class Mutilevel {
  public static void main(String args[]){
    Demo3 d = new Demo3();
    d.display();
  }
}
