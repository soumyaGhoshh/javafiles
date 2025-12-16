// Method overloading - in method overloading method name stays same, but differs in terms of no. of parameters or types of parameters or order of parameters. They belong to the same class unlike method overriding where super class methods are implemented into subclasses and resolved seeing the object runtime. Overloading provides flexibility and code resuability. The need for method overlaoding is that if you do not overload a method you will have to create multiple method names for same task basically which is not so good for maintaining and documenting. In method overloading you mostly use parameters inside methods instead to constructors. Use constructors in method overriding.


class Calculator{

  //add two integers
  public void ladd(int a, int b){
    System.out.println("Sum of two int: " + (a + b));
  }
  //add three integers
  public void add(int a, int b, int c){
    System.out.println("Sum of three int: " + (a + b + c));
  }
  //add two double
  public void add(double a, double b){
    System.out.println("Sum of tow doubles: " + (a + b));
  }
  //add three doubles
  public void add(double a, double b, double c){
    System.out.println("Sum of three doubles : " + (a + b + c));
  }
  //Concatenate two strings
  public void add(String a, String b){
    System.out.println("The two concatenated string: " + a + b);
  }
  //concatenate three strings
  public void add(String a, String b, String c){
    System.out.println("The three concatenated String: " + a + b + c);
  }
  //add elements of array
  public void add(int[] num){
    int sum = 0;
    for(int a : num){
      sum += a;
    }
    System.out.println("The sum of array elems: " + sum);
  }

}

class MathUnits{
  //area of square
  public void calculateArea(double side){
    double area = side * side;
    System.out.println("The area of the square: " + area);
  }
  //area of rectangle
  public void calculateArea(double length, double width){
    double area = length * width;
    System.out.println("The area of the rectangle: " + area);
  }

  //isCircle is redundant param passed to maintain the rules of overloading
  public void calculateArea(double radius, boolean isCircle){
    double area = Math.PI * radius * radius;
    System.out.println("The area of the Circle: " + area);
  }
}

public class Exp6 {
  public static void main(String args[]){

    //overloaded calculator methods
    int[] arr = {3, 5, 6, 8};
    Calculator calc = new Calculator();
    calc.add(3, 4);
    calc.add(5, 6, -9);
    calc.add("Soumya", " Ghosh");
    calc.add(9.6, 6.9);
    calc.add("I ", "love ", "her");
    calc.add(arr);

    //overloaded Area methods
    MathUnits area = new MathUnits();
    area.calculateArea(8.9); //area of square
    area.calculateArea(8.6, 9.8); //aera of rectangle
    area.calculateArea(4.5, true); //area of Circle
  }
}