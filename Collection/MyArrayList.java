import java.util.*;

public class MyArrayList {
    public static void main(String args[]) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(300);
        al.add(200);
        // al.add("praveen"); // Commenting this to avoid ClassCastException
        ArrayList al2 = new ArrayList();
        al2.addAll(al);
        System.out.println(al2);
        Collections.sort(al); // Works fine when all elements are of the same type
        System.out.println(al);
        al2.add(2,"pw");
        System.out.println(al2);
        
    }
}
