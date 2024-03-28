package autoWiring.config;


import autoWiring.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "autoWiring.beans")
public class Config {

    @Bean
    public Vehicle veh1(){
        Vehicle veh1=new Vehicle();
        veh1.setName("Thar");
        return veh1;
    }

    @Bean
    public Vehicle veh2(){
        Vehicle veh2=new Vehicle();
        veh2.setName("Suzuki");
        return veh2;
    }

    @Bean(value = "veh3")
    public Vehicle veh3(){
        Vehicle veh3=new Vehicle();
        veh3.setName("Zippe");
        return veh3;
    }



}
