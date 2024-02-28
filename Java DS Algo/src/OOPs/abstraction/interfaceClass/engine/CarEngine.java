package OOPs.abstraction.interfaceClass.engine;

public class CarEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Car Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Car Engine Stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Car Engine accelerated");
    }
}
