 class MemoryWithVariable {

    // Static variable stored in the Method Area
    static int staticVariable = 100;

    // Instance variable stored in Heap Memory (part of the object)
    int instanceVariable = 50;

    public static void main(String[] args) {
        // Local variable stored in Stack Memory
        int stackVariable = 10;
        System.out.println(stackVariable + " is stored in stack memory (local variable in main)");

        // Creating an object, stored in Heap Memory
        MemoryWithVariable obj = new MemoryWithVariable();
        System.out.println("Object of MemoryWithVariable is created and stored in heap memory");

        // Accessing instance variable (stored in Heap Memory)
        System.out.println("Instance variable (" + obj.instanceVariable + ") is stored in heap memory as part of the object");

        // Using a wrapper class to demonstrate heap memory allocation
        Integer heapVariable = new Integer(20);
        System.out.println(heapVariable + " is stored in heap memory (wrapper object)");

        // Calling an instance method
        obj.instanceMethod();

        // Calling a static method
        staticMethod();

        // String literal (stored in the String Pool, part of Method Area)
        String str = "Hello, World!";
        System.out.println(str + " is stored in the String Pool (part of Method Area)");
    }

    // Instance method to demonstrate local variables
    void instanceMethod() {
        // Local variable in instanceMethod stored in Stack Memory
        int localVariable = 30;
        System.out.println(localVariable + " is a local variable stored in stack memory (in instanceMethod)");
    }

    // Static method to demonstrate Method Area
    static void staticMethod() {
        System.out.println("Static method is loaded and executed from the Method Area");
    }
}
