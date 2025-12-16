//Overriding means a subclass provides a method with the exact same signature as one in its superclass, resolved at runtime based on actual object type
//Overloading means multiple methods share the same name in the same class but have different parameter lists, resolved at compiletime
//Use parent reference variable for object creation when - 
// - working with generic methods(not child specific)
// - processing multiple child class uniformly
// - working with collections childs
//Use child reference variable for object creation when - 
// - when you are using child specific methods
// - working with one specific child
// STATIC vs DYNAMIC binding - 
// static methods - compiletime or early binding 
// instance methods - runtime or late binding
// Benefits of Polymorphism - 
// 1. Flexibility - Code works with both general methods and specific methods
// 2. Exetensibility - Easy to add new types without modifying the existing ones
// 3. Reusability - Generic code that works with multiple classes
// 4. Maintainibility - Clean and organized code through common interfaces

class Shape{
  protected String color;

  Shape(String color){
    this.color = color;
  }
  void calculateArea(){
    System.out.println("This is a generic area.");
  }
  void display(){
    System.out.println("This is a " + color + " shape.");
  }
  void describe(){
    System.out.println("This is a generic shape class.");
  }
}

class Circle extends Shape{
  private double radius;

  Circle(String color, double radius){
    super(color);
    this.radius = radius;
  }

  void calculateArea(){
    double area = Math.PI * radius * radius;
    System.out.println("The area of circle is: " + area);
  }

  void display(){
    System.out.println("This is a " + color + " Circle with radius" + radius);
  }
  void describe(){
    System.out.println("This is circle class");
  }
  void resize(double newRadius){
    this.radius = newRadius;
    System.out.println("The circle is resized to radius " + radius);
  }
  void resize(int scale){
    this.radius *= scale * radius;
    System.out.println("The circle is being scaled to of radius" + radius);
  }
}

class Rectangle extends Shape{
  private double length;
  private double width;

  Rectangle(String color, double length, double width){
    super(color);
    this.length = length;
    this.width = width;
  }
  void calculateArea(){
    double area = length * width; //local variables should alwawys be initialized
    System.out.println("The area of the rectangle is: " + area);
  }
  void display(){
    System.out.println("This is a " + color + " rectangle of length " + length + " width " + width);
  }
  void describe(){
    System.out.println("This is a rectangle class");
  }
}

class Triangle extends Shape{
  private double base;
  private double height;

  Triangle(String color, double base, double height){
    super(color);
    this.base = base;
    this.height = height;
  }
  void calculateArea(){
    double area = 0.5 * base * height;
    System.out.println("The area of the triangle is: " + area);
  }
  void display(){
    System.out.println("This is a " + color + " triangle");
  }
  void describe(){
    System.out.println("This is a Tirangle class.");
  }
}

public class Exp5 {
  public static void main(String Args[]){

    //Runtime-Polymorphism(Mehtod overriding)
    Shape shape1 = new Circle("Red", 8);
    Shape shape2 = new Triangle("Blue", 8, 9);
    Shape shape3 = new Rectangle("Green", 9, 8);

    Shape[] shapes = {shape1, shape2, shape3};
    for(Shape shape : shapes){
      shape.calculateArea();
      shape.display();
    }
    //shape1.resize(4);
    //Parent class refernce can only access generic methods
    //Compiletime-Polymorphism(Method Overloading)
    Circle circle = new Circle("Yellow", 4);
    circle.resize(2);

    circle.describe(); //static method called compiletiime (early binding)
    circle.display();  //not static method called in runtime (late binding)
  }
}
