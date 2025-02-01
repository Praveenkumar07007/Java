import java.util.*;
import java.util.concurrent.*;
public class Demo {
  public static void main(String args[]){
    ArrayList arr = new ArrayList();
    arr.add(35);
    arr.add(62);
    arr.add(92);
    arr.add(0);
    System.out.println(arr);
    //when we are accessing and modifying both then we are telling this concurrent modification
    // when we do concurrent modification through loop it will lead
    // to infinite loop which is not good
    // for(int i=0;i<arr.size();i++){
    //   System.out.println(arr.get(i));
    //   arr.add(100);
    // }

    // fail fast
    // if we do concurrent modification through iterator it will
    // not go to infinite loop it will throw ConcurrentModification Exception
    Iterator it = arr.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
      //arr.add(100);
    }

    // fail safe
    CopyOnWriteArrayList arl = new CopyOnWriteArrayList();
    arl.add(52);
    arl.add(525);
    System.out.println(arl);
    Iterator itr1 = arl.iterator();
    while(itr1.hasNext()){
      System.out.println(itr1.next());
      arl.add(42);
    }

  }
}
