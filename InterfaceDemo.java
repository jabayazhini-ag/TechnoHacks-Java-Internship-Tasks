// Define an interface
interface Greetable {
    void greet();  // method signature only, no body
}

// Implement the interface
class FriendlyGreeting implements Greetable {
    public void greet() {
        System.out.println("Hello! Welcome to the Java Interface Example.");
    }
}

// Main class
public class InterfaceDemo {
    public static void main(String[] args) {
        Greetable greeting = new FriendlyGreeting();
        greeting.greet();
    }
}
