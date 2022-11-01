package interfaces;

// implements the Instructor interface, which means that HumanInstructor needs to fulfill the methods in Instructor
// Can implement multiple interfaces as long as it meets both contracts
public class HumanInstructor implements Instructor, Juggler{
    public String askQuestion(String question) {
        return question.replace("question", "human answer");
    }
    public void juggle() {
        System.out.println("Hey I'm juggling");
    }
}
