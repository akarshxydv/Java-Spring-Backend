package org.example.main;

import org.example.bean.Person;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        //String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getName());
        person.getVehicle().getVs().playMusic();
        person.getVehicle().getVs().aboutTyre();


    }
}