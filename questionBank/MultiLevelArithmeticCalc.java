import java.util.Scanner;

// Level 1: Base class
class BasicOperations {
    protected int num1;
    protected int num2;
    
    // Constructor
    public BasicOperations(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }
    
    // Basic methods
    public int add() {
        return num1 + num2;
    }
    
    public int subtract() {
        return num1 - num2;
    }
    
    public void displayBasic() {
        System.out.println("Numbers: " + num1 + " and " + num2);
        System.out.println("Addition: " + add());
        System.out.println("Subtraction: " + subtract());
    }
}

// Level 2: Intermediate class inheriting from BasicOperations
class IntermediateOperations extends BasicOperations {
    
    // Constructor
    public IntermediateOperations(int a, int b) {
        super(a, b); // Call parent constructor
    }
    
    // Additional operations
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
    
    public void displayIntermediate() {
        displayBasic(); // Inherited from parent
        System.out.println("Multiplication: " + multiply());
        
        double divResult = divide();
        if (num2 != 0) {
            System.out.println("Division: " + divResult);
        }
    }
}

// Level 3: Final class inheriting from IntermediateOperations
class AdvancedOperations extends IntermediateOperations {
    
    // Constructor
    public AdvancedOperations(int a, int b) {
        super(a, b); // Call parent constructor
    }
    
    // Additional advanced operation
    public int modulus() {
        if (num2 != 0) {
            return num1 % num2;
        } else {
            System.out.println("Error: Division by zero!");
            return 0;
        }
    }
    
    // Method to display all operations
    public void displayAllOperations() {
        System.out.println("\n=== ALL ARITHMETIC OPERATIONS ===");
        displayIntermediate(); // Inherited from parent
        
        int modResult = modulus();
        if (num2 != 0) {
            System.out.println("Modulus: " + modResult);
        }
    }
    
    // Additional utility method
    public void displayResultsSummary() {
        System.out.println("\n=== RESULTS SUMMARY ===");
        System.out.println(num1 + " + " + num2 + " = " + add());
        System.out.println(num1 + " - " + num2 + " = " + subtract());
        System.out.println(num1 + " * " + num2 + " = " + multiply());
        
        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + divide());
            System.out.println(num1 + " % " + num2 + " = " + modulus());
        } else {
            System.out.println("Division and Modulus: Not possible (division by zero)");
        }
    }
}

// Main class
public class MultiLevelArithmeticCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        // Create object of the final level class
        AdvancedOperations calculator = new AdvancedOperations(a, b);
        
        // Display all operations
        calculator.displayAllOperations();
        
        // Display summary
        calculator.displayResultsSummary();
        
        scanner.close();
    }
}