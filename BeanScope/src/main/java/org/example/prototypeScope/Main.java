package org.example.prototypeScope;

import org.example.prototypeScope.bean.Animals;
import org.example.prototypeScope.cinfig.AppConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(AppConfig.class);
        var person=context.getBean(Animals.class);
        var person1=context.getBean(Animals.class);
        System.out.println(person.getName());
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());

        if(person1==person){
            System.out.println("Person bean has singleton scoped");
        }
    }
}
