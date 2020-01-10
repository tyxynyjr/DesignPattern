package duck;

import flybehavior.FlyBehavior;
import quackbehavior.QuackBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly () {
        flyBehavior.fly();
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
}