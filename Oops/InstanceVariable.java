public class InstanceVariable {
    int age;
    String name;
    public static void main(String args[]){
        int p = 23;
        System.out.println(p);

        InstanceVariable obj = new InstanceVariable();//obj is the refrence of instancevariable
        System.out.println(obj.name); //Instance variable is initalized by default but local variable is not initalized
        InstanceVariable obj2 = new InstanceVariable();
        obj2.name = "praveen";
        System.out.println(obj2.name);
        
    }
}
