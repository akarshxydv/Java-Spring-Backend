package OOPs.classAndObject.abstraction.interfaceClass.engine;

public class TractorEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Tractor Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Tractor Engine Stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Tractor Engine accelerated");
    }

}
