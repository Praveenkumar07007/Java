public class TypesOfString {
  public static void main(String args[]){
    String str = "Hello World";
    System.out.println(str);
    StringBuilder sb = new StringBuilder("Hello World");
    System.out.println(sb);
    str.concat("how are you");
    System.out.println(str);
    sb.append(" how are you");
    System.out.println(sb);
  }
}
