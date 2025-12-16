abstract class Animal {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    public abstract void makeSound();
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }
}
public class Exp13{
    public static void main(String[] args){
        // Animal animal = new Animal();
        
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");
        
        dog.makeSound();
        dog.sleep();
        cat.makeSound();
        cat.sleep();
    }
}