import java.util.*;

class Student {
  Integer age;
  String name;

  Student(Integer age, String name) {
    this.age = age;
    this.name = name;
  }

  // Override toString() to print student details instead of memory address
  @Override
  public String toString() {
    return "Student{name='" + name + "', age=" + age + "}";
  }
}

public class Main {
  public static void main(String args[]) {
    // Use generics for type safety
    Map<Integer, Student> mp = new HashMap<>();

    // Creating Student objects
    Student st1 = new Student(23, "praveen");
    Student st2 = new Student(25, "lucky");
    Student st3 = new Student(25, "sahbaj");

    // Storing Student objects in the HashMap
    mp.put(1, st1);
    mp.put(3, st2);
    mp.put(2, st3);

    // Now prints meaningful student details instead of memory addresses
    System.out.println(mp);

    // Iterating through the HashMap
    Set<Map.Entry<Integer, Student>> set = mp.entrySet();
    Iterator<Map.Entry<Integer, Student>> itr = set.iterator();

    while (itr.hasNext()) {
      Map.Entry<Integer, Student> data = itr.next();
      System.out.println(data.getKey() + ": " + data.getValue());
    }
  }
}
