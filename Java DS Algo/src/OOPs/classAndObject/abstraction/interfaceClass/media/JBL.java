package OOPs.classAndObject.abstraction.interfaceClass.media;

public class JBL implements Media{
    @Override
    public void start() {
        System.out.println("JBL Music started");
    }

    @Override
    public void next() {
        System.out.println("JBL music song shifted to next");
    }

    @Override
    public void stop() {
        System.out.println("JBL music stopped");
    }
}
