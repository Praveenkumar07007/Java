public class Car {
    class MyCar{
        String name;
        int year;
        public MyCar(){
            System.out.println("mycar class is intialized");
        }
        public MyCar(String name , int year){
            this.name = name;
            this.year = year;
        }
    }
    public static void main(String args[]){
        Car car = new Car();
        MyCar a1 = car.new MyCar();
        MyCar a2 = car.new MyCar("SUV",2020);
        System.out.println(a2.name);
        System.out.println(a2.year);
    }
}


//int arr[][] = new int[4][];
//arr[0] = new int[5];
//arr[1] = new int[8];
//arr[2] = new int[9];



//class TestCar {
//
//    String make;
//    String model;
//    int year;
//
//    public TestCar() {
//        this.make = "Unknown";
//        this.model = "Unknown";
//        this.year = 0;
//    }
//
//    public TestCar(String make, String model, int year) {
//        this.make = make;
//        this.model = model;
//        this.year = year;
//    }
//
//    public void startEngine() {
//        System.out.println("The engine of the " + make + " " + model + " (" + year + ") has started.");
//    }
//}
//
//public class Car {
//    public static void main(String[] args) {
//        TestCar car1 = new TestCar();
//        car1.startEngine();
//
//        TestCar car2 = new TestCar("Toyota", "Corolla", 2022);
//        car2.startEngine();
//    }
//}

