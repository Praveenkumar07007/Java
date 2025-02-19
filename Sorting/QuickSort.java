import java.util.Arrays;

public class QuickSort{
  public static int partition(int arr[],int l,int r){
    int i = l-1;
    int pivot = arr[r];
    for(int j=l;j<r;j++){
      if(arr[j]<pivot){
        i++;
        swap(arr,i,j);
      }
    }
    swap(arr,i+1,r);
    return i+1;
  }
  public static void sort(int arr[],int l,int r){
    if(l<r){
      int pi = partition(arr,l,r);
      sort(arr,l,pi-1);
      sort(arr,pi+1,r);
    }
  }
  public static void swap(int[] arr,int i,int j){
    int temp = arr[j];
    arr[j] = arr[i];
    arr[i]= temp;
  }
  public static void main(String args[]){
    int arr[] = {45,72,82,23,98,24};
    System.out.println(Arrays.toString(arr));
    sort(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
  }
}
