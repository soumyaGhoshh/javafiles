//Inheritance is a property of Object oriented programming language by which we can actually inherit fields and behaviours from a parent class to child classes also there are options for new fields and new properties to be defined in the child class. Inheritance can be of different type, for ex. when a sigle child inherits single parent it's called single inheritance, when mulitple child inherit from single parent it's heirerchial inheritance, when single child inherit from multiple parent it's multiple inheritance which is not valid in java, instead we have something similiar with the usage of interfaces and the last one is multilevel inheritance which is to grandchild-child-parent-grandparent type of inheritance. In inheritance we get protected members of a class which only can be accessed from parent by a child or grandchild. If parent class has an explicit argumented constructor, we all know then the implicit default constructor will not be provided to it by java, and now when you have a child class inheriting it, if there is no constructor java gets it the default one which has default super() called in it, so it gives error, here you must do constructor chaining which means you must call the argumented super keyword with the same signature of parent class inside the child class constructor. What you can also do is that instead explicitly create the default constructor in parent classes, so that in child class called super() doesn't get inturrupted.

//parent class
class Animal{
  protected String name;
  protected int age;
  public Animal(){}

  public Animal(String name, int age){
    this.name = name;
    this.age = age;
  }

  void makeSound(){
    System.out.println(name + " makes a generic sound!");
  }
  void eat(){
    System.out.println(name+ " is eating food!");
  }
  void sleep(){
    System.out.println(name + " is sleeping!");
  }
  void displayInfo(){
    System.out.println("Name: " + name + ", Age: " + age);
  }
}

//child class 1
class Dog extends Animal{
  protected String breed;

  public Dog(String name, int age, String breed){
    super(name, age);
    this.breed = breed;
  }
  @Override
  void makeSound(){
    System.out.println(name + " makes barking sound!");
  }
  void fetchBall(){
    System.out.println(name + " fetches the ball.");
  }
  void displayInfo(){
    System.out.println("Name: " + name + ", Age: " + age + ", Breed: " + breed);
  }
}

//child class 2 for showing heirerchial inheritance
class Cat extends Animal{

  private int livesLeft;

  public Cat(String name, int age, int livesLeft){
    super(name, age);
    this.livesLeft = livesLeft;
  }
  void makeSound(){
    System.out.println(name + " makes meowing sound!");
  }
  void climbTree(){
    System.out.println(name + " climbing a tree");
  }
  void displayInfo(){
    System.out.println("Nmae: " + name + ", Age: " + age + ", Lives Left: " + livesLeft);
  }
}

//grandchild class for showing multilevel inheritance
class Puppy extends Dog{
  private boolean isTrained;
  public Puppy(String name, int age, String breed, boolean isTrained){
    super(name, age, breed);
  }

  void play(){
    System.out.println(name + "is playing happily.");
  }
  void displayInfo(){
    System.out.println("Name: " + name + ", Age: " + age + ", Breed: " + breed + ", Istrained: "+ isTrained);
  }
}

public class Exp4{
  public static void main(String args[]){
  Animal animal = new Animal("genericAnimal", 13);
  animal.displayInfo();
  animal.makeSound();
  animal.eat();
  animal.sleep();

  Dog dog;
  dog = new Dog("Kalu", 5, "desi");
  dog.displayInfo();
  dog.eat();
  dog.makeSound();
  dog.fetchBall();

  Cat cat = new Cat("puchu", 3, 9);
  cat.displayInfo();
  cat.makeSound();
  cat.sleep();
  cat.climbTree();

  Puppy puppy = new Puppy("bhulu", 1, "labrador", true);
  puppy.displayInfo();
  puppy.makeSound();
  puppy.fetchBall();
  puppy.play();
  
  }
}