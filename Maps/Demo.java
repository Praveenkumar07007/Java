import java.util.*;

public class Demo {
  public static void main(String arga[]) {
    HashMap<Integer, String> hs = new HashMap<>();
    Hashtable<Integer, String> ht = new Hashtable<>();
    LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
    TreeMap<Integer, String> tm = new TreeMap<>();

    // Adding elements to HashMap
    hs.put(1, "praveen");
    hs.put(3, "kumar");
    hs.put(9, "lucky");

    System.out.println("HashMap: " + hs);
    System.out.println(hs.get(3));
    // Iterating through keys
    Set<Integer> keySet = hs.keySet();
    Iterator<Integer> itr = keySet.iterator();
    System.out.println("Keys:");
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    Collection values = hs.values();
    Iterator itr3 = values.iterator();
    while(itr3.hasNext()){
      String names = (String)itr3.next();
      System.out.println(names);
    }

    // Iterating through key-value pairs (entrySet)
    Set<Map.Entry<Integer, String>> entrySet = hs.entrySet();
    Iterator<Map.Entry<Integer, String>> itr2 = entrySet.iterator();
    System.out.println("Key-Value Pairs:");
    while (itr2.hasNext()) {
      Map.Entry<Integer, String> data = itr2.next();
      System.out.println(data.getKey() + ": " + data.getValue());
    }
    while (itr2.hasNext()) {
      System.out.println(itr2.next());
    }
  }
}
