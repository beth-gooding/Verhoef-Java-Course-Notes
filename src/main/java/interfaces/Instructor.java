package interfaces;

public interface Instructor {
    public String askQuestion(String question);
    /*
    Create a default method, which is a method with a body i.e. has a {...some code}
    This method will contain the implementation for any new methods you add to an interface, so that the existing
    clients don't break
     */
    default public void takeBreak() {
        System.out.println("Take a break now!");
    }

    public static void doSomething() {

    }
}
