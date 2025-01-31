public class MultipleCatch {
  public static void main(String[] args) {
    int a = 10;
    int b = 0;
    int arr[] = {1,2,3,4,5};
    try{
      int res = a/b;
      System.out.println(res);
      System.out.println(arr[10]);
    }catch(ArithmeticException e){
      System.out.println("Error in arithmetic operation");
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Error in array index out of bounds");
    }catch(Exception e){
      System.out.println("Something went wrong");
    }
  }
}
