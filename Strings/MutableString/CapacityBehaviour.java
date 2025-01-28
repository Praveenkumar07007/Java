public class CapacityBehaviour {
  public static void main(String args[]) {
    // Initial capacity of StringBuilder is 16
    StringBuilder sb = new StringBuilder();
    System.out.println(sb.capacity()); // Prints 16

    // Appending "Hello World" (11 characters), capacity remains 16
    sb.append("Hello World");
    System.out.println(sb.capacity()); // Prints 16

    // Appending another "Hello World" (11 characters), total 22 characters, capacity increases
    sb.append("Hello World");
    System.out.println(sb.capacity()); // Prints 34 (16 * 2 + 2)

    // Initial capacity of StringBuffer is length of string (11) + 16 = 27
    StringBuffer sbf = new StringBuffer("Hello World");
    System.out.println(sbf.capacity()); // Prints 27

    // Appending another "Hello World" (11 characters), total 22 characters, capacity remains 27
    sbf.append("Hello World");
    System.out.println(sbf.capacity()); // Prints 27

    StringBuffer sbf2 = new StringBuffer(150);
    System.out.println(sbf2.capacity()); // Prints 150
    sbf2.append("Hello World");
    sbf2.trimToSize();
    System.out.println(sbf2.capacity()); // Prints 11
    sbf2.reverse();
    System.out.println(sbf2);

    
  }
}
