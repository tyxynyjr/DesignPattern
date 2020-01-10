package quackbehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("... (Cannot make a sound)");
    }
}
