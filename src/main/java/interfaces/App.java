package interfaces;
import interfaces.HumanInstructor;

public class App {
    // This method wants to be given an object that matches the instructor interface
    public static void askLotsOfQuestions (Instructor instructor) {
        String answer = instructor.askQuestion("A question for you");
        System.out.println("Answer is: " + answer);
    }
    public static void main(String[] args) {
        HumanInstructor humanInstructor = new HumanInstructor();
        RobotInstructor robotInstructor = new RobotInstructor();

        System.out.println("Asking an instructor, but I don't care what kind");
        askLotsOfQuestions(humanInstructor);
        System.out.println("Asking an instructor, but I don't care what kind");
        askLotsOfQuestions(robotInstructor);
        System.out.println("Asking an instructor, this time I want a human instructor");
        System.out.println(humanInstructor.askQuestion("A question for a human instructor"));
        System.out.println("Asking an instructor, this time I want a robot instructor");
        System.out.println(robotInstructor.askQuestion("A question for a robot instructor"));

        Instructor instructor = humanInstructor;
        // This line below won't work as the reference is instructor, so the thread hasn't verified that it is a juggler
        // instructor.juggle();

        // We can cast here because we know that the humanInstructor is also a juggler
        Juggler juggler = (Juggler) instructor;

        // Call the takeBreak function on an object from a class that uses the default method
        System.out.println("This take a break is using the default method from the interface");
        humanInstructor.takeBreak();

        // Call the takeBreak function on an object from a class that has overridden the default method
        System.out.println("This take a break has overridden the method from the interface");
        robotInstructor.takeBreak();
    }
}
