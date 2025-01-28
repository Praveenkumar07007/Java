public class MemoryInConcatenation {
  public static void main(String args[]){
    // String s1 = "Hello"; // it will be stored in a memory location in heap of string pool
    // String s2 = "World";
    // String s3 = s1.concat(s2); // it will be stored in a new memory location in heap not in string pool
    // System.out.println(s3);
    // String s4 = new String("hey");
    // s4 = s4.concat(" there"); // it will be stored in a new memory location in heap
    // System.out.println(s4);
    // System.out.println(s1);


    String s1 = "hello";
    String s2 = "world";
    String s3 = "hey "+ "there"; // it will be stored in a memory location in heap of string pool
    String s4 = s1 + s2; // it will be stored in a new memory location in heap not in string pool

    String s5 = "hey"+53+true; // it will be stored in a memory location in heap of string pool
    System.out.println(s5);
    System.out.println(s3);
    System.out.println(s4);



  }
}
