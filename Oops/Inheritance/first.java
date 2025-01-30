class Human{
  int age;
  private String name;
  public Human(){
    System.out.println("Human is created");
  }
  void sleep(){
    age = 18;
    System.out.println("Human is sleeping");
    System.out.println("Age: "+age);
  }
}

class Student extends Human{ //child classs derived class or subclass
  void display(){
    System.out.println("The age of student is: "+age);
    //System.out.println("The name of student is: "+name);
  }

}
public class first {
  public static void main(String args[]){
    Student s = new Student();
    s.sleep();
    s.display();
  }
}
