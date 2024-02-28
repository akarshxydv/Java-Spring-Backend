package OOPs.classAndObject.abstraction.interfaceClass.media;

public class Bose implements Media{
    @Override
    public void start() {
        System.out.println("Bose Music started");
    }

    @Override
    public void next() {
        System.out.println("Bose music song shifted to next");
    }

    @Override
    public void stop() {
        System.out.println("Bose music stopped");
    }
}
