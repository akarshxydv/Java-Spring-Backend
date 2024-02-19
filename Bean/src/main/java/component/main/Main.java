package component.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context =new AnnotationConfigApplicationContext(component.config.Config.class);
        var veh1=context.getBean(component.bean.Vehicle.class);
        System.out.println(veh1.getName());
        veh1.printHello();
    }
}
