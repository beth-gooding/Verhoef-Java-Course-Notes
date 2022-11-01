package classdesign;

public class Greeter {
    private static String defaultGreeting = "Hello";

    public static String getDefaultGreeting () {
        return defaultGreeting;
    }

    private String greeting;

    public Greeter(String greeting) {
        this.greeting = greeting;
    }

    void sayHello( String name, int count ) {
        for (int counter = 0; counter < count; counter++ ) {
            System.out.println(greeting + " " + name);
        }
    }

    public static void main(String[] args) {
        int count = 3;
        Greeter greeter = new Greeter("Hi there");
        greeter.sayHello("Beth", count);
    }
}
