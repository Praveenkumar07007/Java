// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// ○ Create an abstract class Shape with an abstract method draw().
// ○ Extend it with Circle and Rectangle classes, implementing the draw()
// method.
// ○ Test them in a main method.

abstract class Shape{
  public abstract void draw();
}

class Circle extends Shape {
  @Override
  public void draw() {
      System.out.println("Drawing a Circle");
  }
}

class Rectangle extends Shape {
  @Override
  public void draw() {
      System.out.println("Drawing a Rectangle");
  }
}

public class abstraction {
  public static void main(String[] args) {
      Shape circle = new Circle();
      Shape rectangle = new Rectangle();
      circle.draw();
      rectangle.draw();
  }
}
