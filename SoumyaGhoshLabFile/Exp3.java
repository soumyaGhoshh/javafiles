// Encapsulation is a feature of oops which lets data and methods to get closely bound together like capsule, encapsulation features - 
// Data Hiding: All fields (name, age, gpa) are declared as private
// Public Getters: Provide controlled read access to private fields
// Public Setters: Provide controlled write access with validation
// Validation Logic: Setters include business rules to ensure data integrity
// Controlled Access: No direct access to fields from outside the class

// Benefits of Encapsulation:

// Data Protection: Prevents invalid data from being stored
// Flexibility: Internal implementation can change without affecting other code
// Control: Centralized validation and access control
// Maintainability: Easier to debug and modify

class Student{
  
  //private fields
  private String name;
  private int age;
  private double gpa; 

  //public constructor
  Student(String name, int age, double gpa){
    this.name = name;
    this.age = age;
    this.gpa = gpa;
  }

  //public getters(accessors)
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public double getGpa(){
    return gpa;
  }

  //public setters(mutators)
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public void setGpa(double gpa){
    this.gpa = gpa;
  }

  public void displayStudentInfo(){
    System.out.println("Name: " + name + ", Age: " + age + ", Gpa: " + gpa);
  }
}

class Exp3{
  public static void main(String args[]){
    Student student1 = new Student("Soumya", 20, 8.5);
    student1.displayStudentInfo();

    //System.out.println(student1.name); //can't directly access invisible field
    System.out.println("Name: " + student1.getName()); //instead i use public getters
    System.out.println("Age: " + student1.getAge());
    System.out.println("Gpa: " + student1.getGpa());

    //student1.name = "Rahul"; //can't directly modify invisible fields
    student1.setName("Rahul"); //instead i use public setters
    student1.setAge(21);
    student1.setGpa(9.5);
    student1.displayStudentInfo();
  }
}