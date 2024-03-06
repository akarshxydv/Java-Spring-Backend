package OOPs.abstraction.interfaceClass;

import OOPs.abstraction.interfaceClass.engine.Engine;
import OOPs.abstraction.interfaceClass.engine.TractorEngine;
import OOPs.abstraction.interfaceClass.media.Bose;
import OOPs.abstraction.interfaceClass.media.Media;

public class Vehicle {

    private Engine engine;
    private Media media;

    public Vehicle(Engine engine,Media media){
        this.engine=engine;
        this.media=media;
    }
    public Vehicle(){
        this.engine=new TractorEngine();
        this.media=new Bose();

    }

    public Engine getEngine() {
        return engine;
    }

    public Media getMedia() {
        return media;
    }
}
