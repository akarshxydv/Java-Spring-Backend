package OOPs.abstraction.interfaceClass;

import OOPs.abstraction.interfaceClass.engine.CarEngine;
import OOPs.abstraction.interfaceClass.media.Bose;

public class Main {
    public static void main(String[] args) {
        Vehicle veh1=new Vehicle(new CarEngine(),new Bose());
        veh1.getEngine().start();
        veh1.getMedia().start();
        Vehicle veh2=new Vehicle();
        veh2.getMedia().start();
          
    }
}
