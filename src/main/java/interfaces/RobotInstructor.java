package interfaces;

// implements the Instructor interface, which means that RobotInstructor needs to fulfill the methods in Instructor
public class RobotInstructor implements Instructor{
    public String askQuestion(String question) { return question.replace("question", "robot answer");}

    @Override
    public void takeBreak() {
        System.out.println("Robot instructor says take a break!");
    }
}
