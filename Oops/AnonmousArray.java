 class Calc{
  public Calc(){
    System.out.println("Anonymous Array is created");
  }
  public void cal(){
    System.out.println("Anonymous Array is calling you");
  }
  public int add(int arr[]){
    int sum = 0;
    for(int n:arr){
      sum += n;
    }
    return sum;
  }
}

public class AnonmousArray {
  public static void main(String[] args) {
    System.out.println("Anonymous Array");
      // normal array call
    int arr[] = new int[]{1, 2, 3, 4, 5};
    Calc obj = new Calc();
    obj.cal();
    int x =obj.add(arr);
    // anonymous array call
    int y =obj.add(new int[]{5,6,7,8,9});
    System.out.println(x);
    System.out.println(y);
  }
}
