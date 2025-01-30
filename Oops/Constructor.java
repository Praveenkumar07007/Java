class Demo{
  public Demo(){
    System.out.println("this is a default constructor");
  }
  public Demo(String name,int age){
    System.out.println("Name: "+name+" Age: "+age);
    System.out.println("Constructor called");
  }
}

public class Constructor {
  public static void main(String args[]){
    Demo d = new Demo("praveen",21);
    Demo p = new Demo();
  }
} 
