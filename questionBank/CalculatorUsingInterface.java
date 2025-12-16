// Interface Arithmetic
interface Arithmetic {
    // All methods are public by default in interface
    void add(int a, int b);
    void sub(int a, int b);
    void mul(int a, int b);
    void div(int a, int b);
    void mod(int a, int b);
    
    // Overloaded methods for float parameters
    void add(float a, float b);
    void sub(float a, float b);
    void mul(float a, float b);
    void div(float a, float b);
}

// Concrete class implementing Arithmetic interface
class Operation implements Arithmetic {
    // Implementing integer methods
    public void add(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
    
    public void sub(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }
    
    public void mul(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }
    
    public void div(int a, int b) {
        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("Error: Division by zero!");
        }
    }
    
    public void mod(int a, int b) {
        if (b != 0) {
            System.out.println(a + " % " + b + " = " + (a % b));
        } else {
            System.out.println("Error: Division by zero!");
        }
    }
    
    // Implementing float methods
    public void add(float a, float b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
    
    public void sub(float a, float b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }
    
    public void mul(float a, float b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }
    
    public void div(float a, float b) {
        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("Error: Division by zero!");
        }
    }
}

// Main class to test the calculator
public class CalculatorUsingInterface {
    public static void main(String[] args) {
        Operation calc = new Operation();
        
        System.out.println("=== Integer Operations ===");
        calc.add(10, 5);
        calc.sub(10, 5);
        calc.mul(10, 5);
        calc.div(10, 5);
        calc.mod(10, 3);
        
        System.out.println("\n=== Float Operations ===");
        calc.add(10.5f, 2.5f);
        calc.sub(10.5f, 2.5f);
        calc.mul(10.5f, 2.5f);
        calc.div(10.5f, 2.5f);
        
        System.out.println("\n=== Division by Zero Test ===");
        calc.div(10, 0);
        calc.div(10.5f, 0.0f);
    }
}