public class First {
  public static void main(String args[]){
    StringBuilder s1 = new StringBuilder("Hello");
    StringBuilder s2 = new StringBuilder(" World");
    s1.append(s2);
    System.out.println(s1);
    StringBuffer s3 = new StringBuffer("hey");
    s3.append(" there");
    System.out.println(s3);
  }
}
