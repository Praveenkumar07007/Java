class Rect {
  private int height;
  private int width;

  // Constructor
  public Rect(int height, int width) {
      this.height = height;
      this.width = width;
  }

  // Method to calculate area
  int getArea() {
      return height * width;
  }

  // Method to calculate perimeter
  int getPerimeter() {
      return 2 * (height + width);
  }
}

public class Rectangle {
  public static void main(String args[]) {
      // Creating an instance with valid arguments
      Rect r = new Rect(34, 32);

      // Getting and printing results
      System.out.println("Area: " + r.getArea());
      System.out.println("Perimeter: " + r.getPerimeter());
  }
}
