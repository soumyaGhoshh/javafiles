// Interface Salary
interface Salary {
    double basicSalary = 50000; // data member
    
    void basicSal(); // method
}

// Employee class
class Employee {
    String Name;
    int Age;
    
    // Constructor
    Employee(String name, int age) {
        this.Name = name;
        this.Age = age;
    }
    
    // display method
    void display() {
        System.out.println("Employee Name: " + Name);
        System.out.println("Employee Age: " + Age);
    }
}

// GrossSalary class inheriting from both Employee and Salary
class GrossSalary extends Employee implements Salary {
    double TA;  // Travel Allowance
    double DA;  // Dearness Allowance  
    double HRA; // House Rent Allowance
    
    // Constructor
    GrossSalary(String name, int age, double ta, double da, double hra) {
        super(name, age);
        this.TA = ta;
        this.DA = da;
        this.HRA = hra;
    }
    
    // Implementing basicSal() from Salary interface
    public void basicSal() {
        System.out.println("Basic Salary: " + basicSalary);
    }
    
    // totalSal() method
    void totalSal() {
        double total = basicSalary + TA + DA + HRA;
        System.out.println("Total Salary: " + total);
    }
    
    // Method to display all details
    void displayAll() {
        display();      // From Employee class
        basicSal();     // From Salary interface
        System.out.println("Travel Allowance (TA): " + TA);
        System.out.println("Dearness Allowance (DA): " + DA);
        System.out.println("House Rent Allowance (HRA): " + HRA);
        totalSal();     // From GrossSalary class
    }
}

// Main class
public class SalaryCountUsingInterface {
    public static void main(String[] args) {
        // Create object of GrossSalary class
        GrossSalary emp = new GrossSalary("John Doe", 30, 5000, 8000, 10000);
        
        // Display complete details
        System.out.println("=== Employee Details ===");
        emp.displayAll();
    }
}