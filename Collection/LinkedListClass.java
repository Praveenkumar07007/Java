import java.util.*;

public class LinkedListClass {
  public static void main(String args[]){
    LinkedList ll = new LinkedList(); // isme list ke sath sath dequeue ka bhi kuch methods hoga
    ll.add(200);
    ll.add(400);
    ll.add(100);
    ll.add("praveen");
    ll.addFirst(500);
    ll.addLast(600);
    ll.add(2,40);
    System.out.println(ll);

  }
}
