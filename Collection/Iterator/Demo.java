import java.util.*;
public class Demo {
  public static void main(String args[]){
    ArrayList arr = new ArrayList();
    arr.add(234);
    arr.add(52);
    arr.add(24);
    arr.add(51);
    System.out.println(arr);
    // we cannot access all types collections elements with index because
    // some of the collection is not supporting indexing
    // that's why we prefer to use iterator instead of indexing

    Iterator itr = arr.iterator();
    while(itr.hasNext()){
      //Integer i = (Integer)itr.next();
      System.out.print(itr.next()+" ");
    }
    System.out.println();
    ListIterator litr =arr.listIterator(arr.size()); // only in list classes(like Arraylist and LinkdedList) not in set classes
    while(litr.hasPrevious()){
      System.out.print(litr.previous()+" ");
    }
  }
}
