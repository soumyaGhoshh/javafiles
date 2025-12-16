class Student{
    private String name;
    private int age;
    private double gpa;
    //default
    public Student(){
        this.name = "Unknown";
        this.age = 0;
        this.gpa = 0.0;
        System.out.println("Default constructor called");
    }
    public Student(String name){
        this.name = name;
        this.age = 0;
        this.gpa = 0.0;
        System.out.println("nmae only constructor called");
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.gpa = 0.0;
        System.out.println("nmae and age constructor called");
    }
    public Student(String name, int age, double gpa){
        this.name =name;
        this.age = age;
        this.gpa = gpa;
        System.out.println("Full parameter constructor called");
    }
    public void display(){
        System.out.println("Name:"+ name +", Age: " + age + ", GPA: " + gpa);
    }
}

public class Exp12{
    public static void main(String[] args) {
        //calld based on params
        Student s1 = new Student();
        Student s2 = new Student("Soumya Ghosh");
        Student s3 = new Student("Rahul bhera", 22);
        Student s4 = new Student("Dhimant Bhardwaj", 20, 8.8);
        
        System.out.println();
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}