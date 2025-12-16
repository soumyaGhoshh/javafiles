class AccessDemo{

    // Different access modifiers
    private String privateVar = "private";
    protected String protectedVar = "protected";
    public String publicVar = "public";
    String defaultVar = "default";
     private void privateMethod(){
        System.out.println("Private method called");
    }
    protected void protectedMethod(){
        System.out.println("Protected method called");
    }
    public void publicMethod() {
        System.out.println("Public method called");
        privateMethod();
    }
    
    void defaultMethod() {
        System.out.println("Default method called");
    }
    
    public void displayAll(){
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
        System.out.println("Default: " + defaultVar);
    }
}

class SubClass extends AccessDemo{
    public void testAccess(){
        System.out.println("protected:" + protectedVar);
        System.out.println("Public: " + publicVar);
        System.out.println("deffault: " + defaultVar);
    }
}

public class Exp11{
    public static void main(String[] args){
        AccessDemo obj = new AccessDemo();
        
        System.out.println("Public: " +obj.publicVar);
        System.out.println("Default: " + obj.defaultVar);
        
        obj.publicMethod();
        obj.defaultMethod();
        
        SubClass sub = new SubClass();
        sub.testAccess();
    }
}

