package za.ac.cput.DependencyInversionPrinciple.good;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-25
 */
public class AnotherPerson implements Greet {
    public AnotherPerson() {
    }

    @Override
    public String formalGreeting() {
        return "Good evening sir.";
    }

    @Override
    public String casualGreeting() {
        return "Sup dude!";
    }
}
