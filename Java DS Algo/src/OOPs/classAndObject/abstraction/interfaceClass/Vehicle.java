package OOPs.classAndObject.abstraction.interfaceClass;

import OOPs.classAndObject.abstraction.interfaceClass.engine.Engine;
import OOPs.classAndObject.abstraction.interfaceClass.media.Media;

public class Vehicle {
    private Engine engine;
    private Media media;

    public Vehicle(Engine engine,Media media){
        this.engine=engine;
        this.media=media;
    }

    public Engine getEngine() {
        return engine;
    }

    public Media getMedia() {
        return media;
    }
}
