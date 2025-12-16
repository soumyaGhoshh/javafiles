class Counter {
    static int count = 0;
    int instanceCount = 0;
    
    public Counter() {
        count++;
        instanceCount++;
    }
    static void displayTotalCount() {
        System.out.println("Total objects created: " + count);
    }

    void displayInfo() {
        System.out.println("Static count: " + count + ", Instance count: " + instanceCount);
    }
}

class MathUtils {
    static final double PI = 3.14159;
    static int add(int a, int b) {
        return a + b;
    }
    static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }
}

class Exp10 {
    static {
        System.out.println("Static block executed - class loaded");
    }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        
        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
        Counter.displayTotalCount();
        
        System.out.println("5 + 3 = " + MathUtils.add(5, 3));
        System.out.println("Circle area: " + MathUtils.calculateCircleArea(5));
        System.out.println("PI value: " + MathUtils.PI);
        
        System.out.println("Counter.count: " + Counter.count);
        System.out.println("c1.count: " + c1.count);
    }
}
