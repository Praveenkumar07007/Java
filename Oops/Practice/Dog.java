class DogM{
  private String name;
  private String breed;
  public DogM(String name, String breed){
    this.name = name;
    this.breed = breed;
  }
  String getName(){
    return name;
  }
  String getBreed(){
    return breed;
  }
}

public class Dog {
  public static void main(String args[]){
    DogM d = new DogM("Lucky","chinese");
    String name = d.getBreed();
    String bread = d.getName();
    System.out.println(name);
    System.out.println(bread);
  }
}
