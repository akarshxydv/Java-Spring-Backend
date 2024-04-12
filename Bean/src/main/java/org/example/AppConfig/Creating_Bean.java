package org.example.AppConfig;

import org.example.bean.Vehicle;
import org.example.bean.Vehicle1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
* */
@Configuration
public class Creating_Bean {

    /*
    @Bean annotation, which lets Spring know that it needs to call
    this method when it initializes its context and adds the returned
    value to the context.
    * */
    @Bean
    String name(){
        return "Akarsh";
    }
    @Bean
    Vehicle vehicle(){
        var vehicle=new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }
    @Bean
    Vehicle1 vehicle1(){
        return new Vehicle1("BMW",10000000);

    }
    @Bean
    int price(){
        return 45000;
    }
}
