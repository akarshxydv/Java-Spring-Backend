package wiringUsingMethod.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wiringUsingMethod.bean.Person;
import wiringUsingMethod.bean.Vehicle;
import wiringUsingMethod.confi.Config;

public class main {
    public static void main(String[] args) {
        var context =new AnnotationConfigApplicationContext(Config.class);
        var per=context.getBean(Person.class);
        var veh=context.getBean(Vehicle.class);
        System.out.println("Person name from Spring Context is: " + per.getName());
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());
        System.out.println("Vehicle that Person own is: " + per.getVehicle());

    }
}
