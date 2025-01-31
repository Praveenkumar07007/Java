public class TryCatch {
  public static void main(String[] args) {
    int a = 10;
    int b = 0;
    try{
      int res = a/b;
      System.out.println(res);
    }catch(Exception e){
      System.out.println("something went wrong");
      System.out.println(e.getMessage());
    }
  }
}
