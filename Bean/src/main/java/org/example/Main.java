package org.example;

import org.example.AppConfig.Creating_Bean;
import org.example.AppConfig.Multiple_Bean_SameName;
import org.example.bean.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {


        //   Now way to creating object and calling function

        Vehicle vehicle=new Vehicle();
        vehicle.setName("BMW");
        System.out.println(vehicle.getName());



        var context = new AnnotationConfigApplicationContext(Multiple_Bean_SameName.class);

        Vehicle veh3=context.getBean(Vehicle.class);
        System.out.println(veh3.getName());

        String name=context.getBean(String.class);
        System.out.println(name);

        var price=context.getBean(int.class);
        System.out.println(price);


        Vehicle veh=context.getBean("vehicle", Vehicle.class);
        System.out.println(veh.getName());

        Vehicle veh2= context.getBean("vehicle2", Vehicle.class);
        System.out.println(veh2.getName());

        Vehicle veh4=context.getBean("maruti",Vehicle.class);
        System.out.println(veh4.getName());



    }
}
