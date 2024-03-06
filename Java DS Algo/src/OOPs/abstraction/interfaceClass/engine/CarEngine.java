package OOPs.abstraction.interfaceClass.engine;

public class CarEngine implements Engine{
    @Override
    public String start() {

        return "Car Engine started";
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
