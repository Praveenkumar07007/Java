import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            list.add(arr[i]);
        }

        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
            System.out.println(list.get(i));
        }
    }
}
