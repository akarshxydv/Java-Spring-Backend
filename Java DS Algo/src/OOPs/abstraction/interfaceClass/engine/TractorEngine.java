package OOPs.abstraction.interfaceClass.engine;

public class TractorEngine implements Engine{

    @Override
    public String start() {

        return "Tractor Engine started";
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
