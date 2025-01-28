public class Concatenation {
  public static void main(String args[]){
    String s1 = "Hello";
    String s2 = "World";
    String s3 = s1 + s2;
    System.out.println(s3);
    s1 = s1.concat("we can add to immutable string");
    System.out.println(s1);
    System.out.println(s3);
    String s4 = s1.concat(s2);
    System.out.println(s4);
  }
}
