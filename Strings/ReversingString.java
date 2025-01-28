public class ReversingString {
  public static void main(String args[]){
    // reverse a string
    String s = "Hello World";
    String rev = "";
    for(int i = s.length()-1; i >= 0; i--){
      rev = rev + s.charAt(i);
    }
    System.out.println(rev);
    // reverse words in a string
    String str = "Hello World";
    String str2 = "";
    String arr[] = str.split(" ");
    for(int i = arr.length-1; i >= 0; i--){
      str2 = str2 + arr[i] + " ";
    }
    System.out.println(str2);
    // reverse words in a string without using split method
    String str3 = "Hello World";
    String str4 = "";
    int start = 0;
    for(int i = 0; i < str3.length(); i++){
      if(str3.charAt(i) == ' '){
        for(int j = i-1; j >= start; j--){
          str4 = str4 + str3.charAt(j);
        }
        str4 = str4 + " ";
        start = i+1;
      }
    }
    for(int i = str3.length()-1; i >= start; i--){
      str4 = str4 + str3.charAt(i);
    }
    System.out.println(str4);
    
  }
}
