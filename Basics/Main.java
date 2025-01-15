// File Name: MainClass.java
public class Main {  // Public class name matches the file name
    public static void main(String[] args) {
        Employeec emp = new Employeec(101, "Alice", "HR");
        emp.displayDetails();
        Employeec emp2 = new Employeec(102, "Bob", "IT");
        emp2.displayDetails();
    }
}

class Employeec {  // Non-public class
    private int employeeId;
    private String name;
    private String department;

    public Employeec(int employeeId, String name, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}
