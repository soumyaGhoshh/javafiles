// Abstract class representing a general Shape
abstract class Shape {
    // Instance variables (common to all shapes)
    private String color;
    
    // Constructor of abstract class
    public Shape(String color) {
        this.color = color;
        System.out.println("Shape constructor called. Color: " + color);
    }
    
    // Abstract method - no implementation
    // Must be implemented by all concrete subclasses
    public abstract double calculateArea();
    
    // Abstract method for calculating perimeter
    public abstract double calculatePerimeter();
    
    // Concrete (non-abstract) method - common implementation for all shapes
    public void displayColor() {
        System.out.println("The color of this shape is: " + color);
    }
    
    // Getter for color
    public String getColor() {
        return color;
    }
    
    // Another concrete method
    public void shapeInfo() {
        System.out.println("This is a " + color + " shape.");
    }
}

// Concrete subclass implementing the abstract class
class Circle extends Shape {
    // Additional instance variable specific to Circle
    private double radius;
    private static final double PI = 3.14159;
    
    // Constructor
    public Circle(String color, double radius) {
        // Call to parent abstract class constructor
        super(color);
        this.radius = radius;
    }
    
    // Implementation of abstract method calculateArea()
    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }
    
    // Implementation of abstract method calculatePerimeter()
    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
    
    // Additional method specific to Circle
    public void displayRadius() {
        System.out.println("Radius of circle: " + radius);
    }
    
    // Overriding the shapeInfo method to provide Circle-specific information
    @Override
    public void shapeInfo() {
        super.shapeInfo(); // Call parent implementation
        System.out.println("It is a circle with radius: " + radius);
    }
}

// Another concrete subclass implementing the same abstract class
class Rectangle extends Shape {
    // Additional instance variables specific to Rectangle
    private double length;
    private double width;
    
    // Constructor
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    // Implementation of abstract method calculateArea()
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    // Implementation of abstract method calculatePerimeter()
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    // Additional method specific to Rectangle
    public void displayDimensions() {
        System.out.println("Length: " + length + ", Width: " + width);
    }
    
    // Overriding shapeInfo method for Rectangle-specific information
    @Override
    public void shapeInfo() {
        super.shapeInfo();
        System.out.println("It is a rectangle with dimensions: " + 
                          length + " x " + width);
    }
}

// Main class to test the implementation
public class AbstractClassDemo {
    public static void main(String[] args) {
        System.out.println("=== ABSTRACT CLASS AND METHOD IMPLEMENTATION DEMO ===\n");
        
        // Cannot create object of abstract class
        // Shape shape = new Shape("Red"); // COMPILER ERROR
        
        // Creating objects of concrete subclasses
        Circle circle = new Circle("Red", 7.0);
        Rectangle rectangle = new Rectangle("Blue", 5.0, 3.0);
        
        System.out.println("\n=== CIRCLE OPERATIONS ===");
        // Using Circle object
        circle.displayColor();
        circle.displayRadius();
        circle.shapeInfo();
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Perimeter of Circle: " + circle.calculatePerimeter());
        
        System.out.println("\n=== RECTANGLE OPERATIONS ===");
        // Using Rectangle object
        rectangle.displayColor();
        rectangle.displayDimensions();
        rectangle.shapeInfo();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());
        
        System.out.println("\n=== POLYMORPHISM DEMONSTRATION ===");
        // Using polymorphism - Parent class reference to child class objects
        Shape shape1 = new Circle("Green", 10.0);
        Shape shape2 = new Rectangle("Yellow", 6.0, 4.0);
        
        // Runtime polymorphism - JVM decides which method to call
        System.out.println("\nUsing Parent Reference for Circle:");
        shape1.displayColor();
        System.out.println("Area: " + shape1.calculateArea()); // Calls Circle's calculateArea()
        System.out.println("Perimeter: " + shape1.calculatePerimeter()); // Calls Circle's calculatePerimeter()
        
        System.out.println("\nUsing Parent Reference for Rectangle:");
        shape2.displayColor();
        System.out.println("Area: " + shape2.calculateArea()); // Calls Rectangle's calculateArea()
        System.out.println("Perimeter: " + shape2.calculatePerimeter()); // Calls Rectangle's calculatePerimeter()
        
        System.out.println("\n=== ARRAY OF SHAPES DEMONSTRATION ===");
        // Creating an array of Shape objects
        Shape[] shapes = {
            new Circle("Orange", 5.0),
            new Rectangle("Purple", 8.0, 6.0),
            new Circle("Pink", 3.0),
            new Rectangle("Brown", 10.0, 2.0)
        };
        
        // Process all shapes uniformly
        double totalArea = 0;
        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            totalArea += area;
            System.out.println("Shape Color: " + shape.getColor() + 
                             ", Area: " + area);
        }
        System.out.println("Total Area of all shapes: " + totalArea);
    }
}