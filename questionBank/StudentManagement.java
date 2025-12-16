import java.util.Scanner;

class Student {
    String name;
    int rollno;
    int age;
    String gender;
    int sub1;
    int sub2;
    
    // Method to initialize student data
    void initialize() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        this.name = sc.nextLine();
        
        System.out.print("Enter Roll No: ");
        this.rollno = sc.nextInt();
        
        System.out.print("Enter Age: ");
        this.age = sc.nextInt();
        
        sc.nextLine(); // consume newline
        
        System.out.print("Enter Gender: ");
        this.gender = sc.nextLine();
        
        System.out.print("Enter Marks for Subject 1: ");
        this.sub1 = sc.nextInt();
        
        System.out.print("Enter Marks for Subject 2: ");
        this.sub2 = sc.nextInt();
        
        sc.close();
    }
    
    // Method to calculate total marks
    int calculateTotal() {
        return sub1 + sub2;
    }
    
    // Method to calculate percentage
    double calculatePercentage() {
        return (calculateTotal() / 200.0) * 100;
    }
    
    // Method to calculate grade
    String calculateGrade() {
        double percentage = calculatePercentage();
        
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "F";
    }
    
    // Method to display student details
    void display() {
        System.out.println("\n=== Student Details ===");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
        System.out.println("Total Marks: " + calculateTotal() + "/200");
        System.out.println("Percentage: " + String.format("%.2f", calculatePercentage()) + "%");
        System.out.println("Grade: " + calculateGrade());
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        // Create array of student objects
        Student[] students = new Student[n];
        
        // Initialize all students
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Student " + (i + 1) + " ---");
            students[i] = new Student();
            students[i].initialize();
        }
        
        // Display all students
        System.out.println("\n\n=== FINAL RESULTS ===");
        for (int i = 0; i < n; i++) {
            students[i].display();
            System.out.println("-----------------------");
        }
        
        sc.close();
    }
}