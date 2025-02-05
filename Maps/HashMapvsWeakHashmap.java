import java.util.HashMap;
class Employee{
  String name;
  Integer empId;
  Employee(String name , Integer empId){
    this.name = name;
    this.empId = empId;
  }
  public String toString(){
    return empId+"";
  }
  @Override
  public void finalize(){
    System.out.println("clean up work by gc before deallocating memory from heap");

  }
}
public class HashMapvsWeakHashmap {
  public static void main(String args[]){
    Employee e = new Employee("praveen",171);
    HashMap hm = new HashMap();
    hm.put(e,"praveen");
    e = null ;
    System.gc();// this will call garbage collector
    System.out.println(hm);
    System.out.println("last line");
  }
}
