package java_methods;

public class Methods {
    // Constructor
    public Methods() {
        System.out.println("Constructor called!");
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    // Static methods
    public static void staticMethod1() {
        System.out.println("This is static method 1.");
    }

    public static void staticMethod2() {
        System.out.println("This is static method 2.");
    }

    public static void main(String[] args) {
        // Call constructor and non-static method
        Methods obj = new Methods();
        obj.nonStaticMethod();

        // Call static methods
        staticMethod1();
        staticMethod2();
    }
}