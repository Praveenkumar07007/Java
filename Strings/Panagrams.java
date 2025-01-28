class Panagrams {

  public static boolean isPangram(String str) {
      if (str == null || str.length() < 26) {
          return false;
      }

      boolean[] alphabetPresent = new boolean[26];
      str = str.toLowerCase();

      for (int i = 0; i < str.length(); i++) {
          char c = str.charAt(i);
          if (c >= 'a' && c <= 'z') {
              alphabetPresent[c - 'a'] = true;
          }
      }

      for (boolean present : alphabetPresent) {
          if (!present) {
              return false;
          }
      }
      return true;
  }

  public static void main(String[] args) {
      String test1 = "The quick brown fox jumps over the lazy dog";
      String test2 = "Hello World";
      String test3 = "Pack my box with five dozen liquor jugs";

      System.out.println("Test 1 is pangram: " + isPangram(test1)); // true
      System.out.println("Test 2 is pangram: " + isPangram(test2)); // false
      System.out.println("Test 3 is pangram: " + isPangram(test3)); // true
  }
}
