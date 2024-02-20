package registerBean.main;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import registerBean.bean.Vehicle;
import registerBean.config.Config;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);

        //   here we are creating supplier based on that it will return value;
        Vehicle audi=new Vehicle();
        audi.setName("Audi R8");
        Supplier<Vehicle> audiSup=()->audi;

        Supplier<Vehicle> mahindraSup=()->{
            Vehicle mahindra=new Vehicle();
            mahindra.setName("Scorpio");
            return mahindra;
        };

        Random random=new Random();
        int num=random.nextInt(10);

        if(num %2==0){
            context.registerBean("audi", Vehicle.class,audiSup);
        }else context.registerBean("mahindra", Vehicle.class,mahindraSup);

        try {
            var getAudi=context.getBean("audi", Vehicle.class);
            System.out.println(getAudi.getName());
            getAudi.print();
        }catch (NoSuchBeanDefinitionException beanE){
            System.out.println("Error while creating audi bean");
        }

        try{
            var getMahindra=context.getBean("mahindra", Vehicle.class);
            System.out.println(getMahindra.getName());
            getMahindra.print();
        }catch (NoSuchBeanDefinitionException beanE){
            System.out.println("Error while creating mahindra bean");
        }



    }
}
