
class InsertionSort{
  public static void main(String args[]){
    int arr[] = {5,2,6,1,9,2};
    for(int i=1;i<arr.length;i++){
      int j=i;
      while(j>=1 && arr[j]<arr[j-1]){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
        j--;
      }
    }
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}
