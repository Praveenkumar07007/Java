import java.util.*;
class Student{
  String name;
  int id;
}

public class Demo {
  public static void main(String args[]){
    Student s1 = new Student();
    s1.name = "praveen";
    s1.id = 24;
    ArrayList<Student> arr= new ArrayList<Student>();
    arr.add(s1);
    System.out.println(s1.name);
    
  }
}
