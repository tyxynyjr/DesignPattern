import duck.Duck;
import flybehavior.FlyWithWings;
import duck.MallardDuck;
import duck.ModelDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();

        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        model.display();
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
        model.display();
    }
}