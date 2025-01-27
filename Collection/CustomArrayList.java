import java.util.ArrayList;

public class CustomArrayList {
  public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("green");

    int index = colors.indexOf("blue");
    if (index != -1) {
      colors.set(index, "yellow");
    }

    System.out.println(colors);
  }
}
