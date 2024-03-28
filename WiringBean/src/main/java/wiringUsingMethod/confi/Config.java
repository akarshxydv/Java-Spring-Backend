package wiringUsingMethod.confi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import wiringUsingMethod.bean.Person;
import wiringUsingMethod.bean.Vehicle;

@Configuration
public class Config {

    @Bean
    @Primary
    public Vehicle veh1(){
        Vehicle veh=new Vehicle();
        veh.setName("Kia");
        return veh;
    }
    @Bean
    public Vehicle veh2(){
        Vehicle veh=new Vehicle();
        veh.setName("Honda");
        return  veh;
    }
    /*
        Here in the below code, we are trying to wire or establish a relationship between Person
        and Vehicle, by passing the vehicle as a method parameter to the person() bean method.

        Spring injects the vehicle bean to the person bean using Dependency Injection. Spring will
        make sure to have only 1 vehicle bean is created and also vehicle bean will be created
        first always as person bean has dependency on it.

        * */
//    @Bean
//    public Person per1(){
//        Person per=new Person();
//        per.setName("Akarsh");
//        per.setVehicle(veh1());
//        return per;
//    }

    //  autowiring through method parameter

    @Bean
    public Person per2(@Qualifier("veh2") Vehicle vehicle){
        Person per=new Person();
        per.setName("Aviral");
        per.setVehicle(vehicle);
        return per;
    }
}
