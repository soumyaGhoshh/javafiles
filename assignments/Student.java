public class Student{
    //declaring all the instance variables
    private String name;
    private int rollnumber;
    private String department;
    private double cgpa;

    //default constructor having no parameters,initializes object with default values
    public Student(){
        this.name = "unknown";
        this.rollnumber = 0;
        this.department = "not assigned";
        this.cgpa = 0.0;
        System.out.println("This is default constructor called.");

        // this("unknown", 0, "not assigned", 0.0); // calls the fully paramaterized or the primary constructorf
    }

    //fully paramaterized primary constructor, complete initialization with all attributes
    public Student(String name, int rollnumber, String department, double cgpa){
        this.name = name;
        this.rollnumber = rollnumber;
        this.department = department;
        this.cgpa = cgpa;
        System.out.println("This is fully parametarized contructor called.");
    }

    //copy constructor, initialized with the same constructor whose copy it is
    public Student(Student otherstudent){
        this.name = otherstudent.name;
        this.rollnumber = otherstudent.rollnumber;
        this.department = otherstudent.department;
        this.cgpa = otherstudent.cgpa;
        System.out.println("This is copy constructor");
    }

    //method to display all the instance members
    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Rollnumber: " + rollnumber);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
    }
    public static void main(String args[]){
        System.out.println("creating student objects using different constructors");
        
        Student student1 = new Student();
        student1.displayDetails();

        Student student2 = new Student("Soumya", 10093, "SCAI", 9.8);
        student2.displayDetails();

        Student student3 = new Student(student2); //creates a copy of the contructor student
        student3.displayDetails();
    }
}