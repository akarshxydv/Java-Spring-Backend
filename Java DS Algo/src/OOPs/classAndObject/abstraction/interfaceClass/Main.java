package OOPs.classAndObject.abstraction.interfaceClass;

import OOPs.classAndObject.abstraction.interfaceClass.engine.CarEngine;
import OOPs.classAndObject.abstraction.interfaceClass.media.Bose;

public class Main {
    public static void main(String[] args) {
        Vehicle veh1=new Vehicle(new CarEngine(),new Bose());
        veh1.getEngine().start();
        veh1.getMedia().start();
    }
}
