import java.util.Scanner;

// Base class
class ArithmeticOperations {
    protected int num1;
    protected int num2;
    
    // Constructor to initialize numbers
    public ArithmeticOperations(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }
    
    // Basic arithmetic methods
    public int add() {
        return num1 + num2;
    }
    
    public int subtract() {
        return num1 - num2;
    }
    
    public int multiply() {
        return num1 * num2;
    }
    
    public double divide() {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("Error: Division by zero!");
            return 0;
        }
    }
    
    public int modulus() {
        if (num2 != 0) {
            return num1 % num2;
        } else {
            System.out.println("Error: Division by zero!");
            return 0;
        }
    }
    
    // Method to display basic operations
    public void displayBasicOperations() {
        System.out.println("Numbers: " + num1 + " and " + num2);
        System.out.println("Addition: " + add());
        System.out.println("Subtraction: " + subtract());
        System.out.println("Multiplication: " + multiply());
        
        double divResult = divide();
        if (num2 != 0) {
            System.out.println("Division: " + divResult);
        }
        
        int modResult = modulus();
        if (num2 != 0) {
            System.out.println("Modulus: " + modResult);
        }
    }
}

// Derived class extending ArithmeticOperations
class AdvancedOperations extends ArithmeticOperations {
    
    // Constructor
    public AdvancedOperations(int a, int b) {
        super(a, b); // Call parent constructor
    }
    
    // Additional advanced operations
    public int power() {
        return (int) Math.pow(num1, num2);
    }
    
    public double squareRoot1() {
        if (num1 >= 0) {
            return Math.sqrt(num1);
        } else {
            System.out.println("Error: Cannot calculate square root of negative number!");
            return 0;
        }
    }
    
    public double squareRoot2() {
        if (num2 >= 0) {
            return Math.sqrt(num2);
        } else {
            System.out.println("Error: Cannot calculate square root of negative number!");
            return 0;
        }
    }
    
    public int findMax() {
        return Math.max(num1, num2);
    }
    
    public int findMin() {
        return Math.min(num1, num2);
    }
    
    // Method to display all operations (basic + advanced)
    public void displayAllOperations() {
        System.out.println("\n=== BASIC ARITHMETIC OPERATIONS ===");
        displayBasicOperations(); // Inherited method
        
        System.out.println("\n=== ADVANCED OPERATIONS ===");
        System.out.println(num1 + " ^ " + num2 + " = " + power());
        System.out.println("Square root of " + num1 + " = " + squareRoot1());
        System.out.println("Square root of " + num2 + " = " + squareRoot2());
        System.out.println("Maximum: " + findMax());
        System.out.println("Minimum: " + findMin());
    }
}

// Main class
public class CalculatorUsingInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        // Create object of derived class
        AdvancedOperations calculator = new AdvancedOperations(a, b);
        
        // Display all operations
        calculator.displayAllOperations();
        
        scanner.close();
    }
}