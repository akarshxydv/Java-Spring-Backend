package org.example.config;

import org.example.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"org.example.bean","org.example.services","org.example.implementation.music","org.example.implementation.tyres"})
public class ProjectConfig {

    @Bean
    Person p1(){
        Person per=new Person();
        per.setName("Akarsh Yadav");
        return per;
    }

    @Bean
    @Primary
    Person p2(){
        Person per=new Person();
        per.setName("Aviral Yadav");
        return per;
    }
    @Bean
    Person p3(){
        Person per=new Person();
        per.setName("Ansh Yadav");
        return per;
    }

}
