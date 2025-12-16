class Person{
  String name;
  int age;
  String nationality;

  //fully initialized constructor
  public Person(String name, int age, String nationality){
    this.name = name;
    this.age = age;
    this.nationality = nationality;
  }

  //default person class
  public Person(){ 
    this.name = "unknown";
    this.age = 25;
    this.nationality = "Unknown";
  }

  //overriden method 
  public void displayInfo(){
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Nationality: " + nationality);
    introduce();
  }

  //super method calling
  public void introduce(){
    System.out.println("Hi I am "+ name + " from " + nationality);
  }

  //final method
  public final void breathe(){
    System.out.println(name + " is breathing");
  }
}


//inherits person class
class Student extends Person{
  private String studentId;
  private String major;
  private double gpa;

  //unconstructed (full parameterized constructor)
  public Student(String name, int age, String nationality, String studentId, String major, double gpa){
    super(name, age, nationality); //super method
    this.studentId = studentId;
    this.major = major;
    this.gpa = gpa;
  }

  //partially constructed constructor
  public Student(String name, String studentId, String major){
    super(name, 21, "Indian");
    this.studentId = studentId;
    this.major = major;
    this.gpa = 0;
  }
  public void displayInfo(){
    super.displayInfo();
    System.out.println("Student Id: " + studentId);
    System.out.println("Major in: " + major);
    System.out.println("Gpa: " + gpa);
  }

  public void study(){
    System.out.println(super.name + "(student id: " + studentId + ") is studying..");
    super.breathe();
  }
}

//inherits perosn class
class Employee extends Person{
  private String employeeId;
  private String department;
  private double salary;

  public Employee(String name, int age, String nationality, String employeeId, String department, double salary){
    super(name, age, nationality);
    this.employeeId = employeeId;
    this.department = department;
    this.salary = salary;
  }

  //constructor with partial parameters will have the other variables assigned
  public Employee(String name , String employeeId, String department){
    super(name, 27, "Indian");
    this.employeeId = employeeId;
    this.department = department;
    this.salary = 20000;
  }

  public void displayInfo(){
    super.displayInfo();
    System.out.println("Employee Id: " + employeeId);
    System.out.println("Department: " + department);
    System.out.println("Salary: " + salary);
  }

  public void work(){
    System.out.println(super.name + "(employee id - " + employeeId + ") is working..");
    super.breathe();
  }
}

//multi-level inheritance 
class StarStudent extends Student{
  private boolean scholarship;

  public StarStudent(String name, int age, String nationality, String studentId, String major, double gpa, boolean scholarship){
    super(name, age, nationality, studentId, major, gpa);
    this.scholarship = scholarship;
  }

  public StarStudent(String name, int age, String nationality){
    super(name, age, nationality, "24MIM10015", "Data Science", 9.5 );
    this.scholarship = true;
  }
  public void displayInfo(){
    super.displayInfo();
    System.out.println("Scholarship status: " + scholarship);
  }

  //multilevel super usage
  public void studyAndSleep(){
    super.study();
    System.out.println("Scholarship status: " + scholarship);
  }
}

public class Exp8 {
  public static void main(String args[]){
    Person person = new Person();
    Student student = new Student("Soumya", "24MIM10093", "Artificial Intelligence");
    Employee employee = new Employee("Enagandula", "21MAT10093", "SASL");
    Student starStudent1 = new StarStudent("Rahul", 20, "Nepali"); //parent class reference(no scholarhip)
    StarStudent starStudent2 = new StarStudent("Swagata", 19, "Bangladeshi"); //child class reference(gets scholarship)


    person.displayInfo();
    person.introduce();
    person.breathe();

    student.displayInfo();
    student.introduce();
    student.study();

    employee.displayInfo();
    employee.introduce();
    employee.work();

    starStudent1.displayInfo();
    starStudent1.introduce();
    starStudent1.study();
    // starStudent1.studyAndSleep(); //parent class ref obj can't have access to StarStudent specific variable (scholarship)

    starStudent2.displayInfo();
    starStudent2.study();
    starStudent2.studyAndSleep(); //can access generic and specific as it is child class refernce object

  }
}

