public class finalKeywordvsMutable {
  // final keyword is not affecting the immutablity of StringBuilder and StringBuffer objects but if we assign
  // a new object to the reference variable then it will not be able to refer to the new object.
  public static void main(String args[]){
    final StringBuilder s1 = new StringBuilder("Hello");
    StringBuilder s2 = new StringBuilder(" World");
    s1.append(s2);
    System.out.println(s1);
    s1 = new StringBuilder("Hey"); // This will give an error
    System.out.println(s1);
    final StringBuffer s3 = new StringBuffer("hey");
    s3.append(" there");
    System.out.println(s3);
    s3 = new StringBuffer("Hey"); // This will give an error
    System.out.println(s3);
  }
}
