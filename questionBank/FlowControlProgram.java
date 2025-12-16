import java.util.Scanner;

public class FlowControlProgram {
    
    // a) Leap year check
    static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
    
    // b) Odd or Even check
    static void checkOddEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
    
    // c) Factorial using recursion
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    // d) Fibonacci series
    static void fibonacci(int count) {
        System.out.print("Fibonacci Series: ");
        int a = 0, b = 1;
        for (int i = 1; i <= count; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
    
    // e) Student grade calculation
    static void calculateGrade(int marks) {
        char grade;
        if (marks >= 90) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 50) grade = 'C';
        else grade = 'F';
        
        System.out.println("Marks: " + marks + ", Grade: " + grade);
    }
    
    // f) Multiplication table
    static void multiplicationTable(int num) {
        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Flow Control Programs ===");
        
        // a) Leap Year
        System.out.print("\nEnter a year: ");
        int year = sc.nextInt();
        checkLeapYear(year);
        
        // b) Odd or Even
        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();
        checkOddEven(num);
        
        // c) Factorial
        System.out.print("\nEnter a number for factorial: ");
        int factNum = sc.nextInt();
        System.out.println("Factorial of " + factNum + " is: " + factorial(factNum));
        
        // d) Fibonacci
        System.out.print("\nEnter count for Fibonacci series: ");
        int fibCount = sc.nextInt();
        fibonacci(fibCount);
        
        // e) Grade Calculation
        System.out.print("\nEnter student marks (0-100): ");
        int marks = sc.nextInt();
        calculateGrade(marks);
        
        // f) Multiplication Table
        System.out.print("\nEnter number for multiplication table: ");
        int tableNum = sc.nextInt();
        multiplicationTable(tableNum);
        
        sc.close();
    }
}