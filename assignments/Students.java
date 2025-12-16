public class Student{
    // Instance variables 
    private String name;
    private int rollNumber;
    private double marks;
    private String department;
    
    public Student(String name, int rollNumber, double marks, String department) { //parameteres inside Student constructor
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.department = department;
    }
    
    public Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = 0.0;
        this.department = "Undeclared";
    }
    
    //here 'this' is optional 
    public void displayStudentInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + this.marks);
        System.out.println("Department: " + this.department);
    }
    
    public void updateMarks(double marks){
        this.marks = marks;  // Assign parameter value to instance variable
    }
    
    // Method to compare current object with another student
    public boolean hasHigherMarks(Student otherStudent){
        return this.marks > otherStudent.marks;
    }
    
    public static void main(String[] args) {
        
        Student student1 = new Student("Soumya Ghosh", 100, 88.5, "AI");
        Student student2 = new Student("Rahul Behera", 102, 92.0, "AI");
        Student student3 = new Student("Lakshya Kant", 103);
        
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
        
        student3.updateMarks(78.5);
        student3.displayStudentInfo();
        
        System.out.println("Comparison Results:");
        System.out.println("Does " + student2.name + " have higher marks than " + student1.name + "? " 
                          + student2.hasHigherMarks(student1));
        System.out.println("Does " + student1.name + " have higher marks than " + student3.name + "? " 
                          + student1.hasHigherMarks(student3));
    }
}