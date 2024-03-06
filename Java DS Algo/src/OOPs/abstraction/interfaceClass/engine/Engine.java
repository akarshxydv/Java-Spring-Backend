package OOPs.abstraction.interfaceClass.engine;

public interface Engine {
    //   you can have static method too but you need to add body to it
    static  void print(){
        System.out.println("I am in engine Interface");
    }


    String start();
    void stop();
    void accelerate();
}
