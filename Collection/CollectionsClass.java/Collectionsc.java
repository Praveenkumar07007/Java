import java.util.ArrayList;
import java.util.Collections;
public class Collectionsc {
  public static void main(String args[]){
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(34);
    arr.add(62);
    arr.add(93);
    arr.add(2);
    arr.add(2);
    System.out.println(arr);
    Collections.sort(arr);
    System.out.println(arr);
    int index = Collections.binarySearch(arr,93); // only when array is sorted
    System.out.println(index); // if not pressent then will give negative value
    Collections.rotate(arr,2);
    System.out.println(arr);
    Collections.shuffle(arr);
    System.out.println(arr);
    System.out.println(Collections.frequency(arr,2));
    
  }
}
