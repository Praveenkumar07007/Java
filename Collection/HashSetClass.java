import java.util.*;
public class HashSetClass {
  public static void main(String args[]){
    HashSet hs = new HashSet(); // order of insertion is not preserved
    hs.add(34);
    hs.add(52);
    hs.add(92);
    hs.add(12);
    hs.add(82);
    System.out.println(hs);

    LinkedHashSet hs1 = new LinkedHashSet(); // order of insertion is preserved
    hs1.add(63);
    hs1.add(92);
    hs1.add(83);
    System.out.println(hs1);
  }
}
