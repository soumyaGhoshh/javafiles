interface Vehicle {
    void start();
    void stop();
    
    default void honk() {
        System.out.println("Beep Beep!");
    }
    
    static void vehicleInfo() {
        System.out.println("This is a vehcle interface");
    }
}

class Car implements Vehicle {
    private String name;
    
    public Car(String name) {
        this.name = name;
    }
    
    public void start() {
        System.out.println(name + " car starting...");
    }
    public void stop() {
        System.out.println(name + " car stopping ...");
    }
}
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starting with kick ...");
    }
    public void stop() {
        System.out.println("Bike stopping...");
    }
}

public class Exp14 {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle bike = new Bike();
        car.start();
        car.honk();
        car.stop();
        bike.start();
        bike.stop();
        Vehicle.vehicleInfo();
    }
}
