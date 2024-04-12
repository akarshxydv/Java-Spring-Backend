package org.example.withAOP.main;

import org.example.withAOP.beans.VehicleServices;
import org.example.withAOP.config.Configuration;
import org.example.withAOP.domain.Song;
import org.example.withAOP.interfaces.VehicleBody;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Configuration.class);
        var veh1=context.getBean(VehicleServices.class);
     //   var veh2=context.getBean(VehicleBody.class);
        Song s1=new Song("baby","Justin");
        String car =veh1.carBody(s1);
       //System.out.println(veh1.getVehicleBody().bodyColor(s1));
        veh1.ex(s1);
        System.out.println(car);    // null



    }
}
