package org.example.AppConfig;

import org.example.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Multiple_Bean_SameName {
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
    Vehicle vehicle2(){
        var vehicle=new Vehicle();
        vehicle.setName("Honda");
        return vehicle;

    }
    @Bean(value = "Hondaaa")
    @Primary              //  primary annotation work as default calling bean if we have multiple same bean method
    Vehicle vehicle3(){
        var vehicle=new Vehicle();
        vehicle.setName("Hondaaaa");
        return vehicle;

    }
    @Bean(value = "maruti")
    Vehicle vehicle4(){
        var vehicle=new Vehicle();
        vehicle.setName("Maruti");
        return vehicle;

    }
    @Bean
    int price(){
        return 45000;
    }
}
