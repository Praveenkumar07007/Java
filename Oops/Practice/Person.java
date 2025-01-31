class Person1 {
  String name;
  int age;
  public Person1(String name, int age){
    this.name = name;
    this.age = age;

  }

}

public class Person{
  public static void main(String args[]){
    Person1 p = new Person1("praveen",21);
    System.out.println(p.name);
    System.out.println(p.age);
  }
}
