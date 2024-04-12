package org.example.singletonScope;

import org.example.singletonScope.bean.Person;
import org.example.singletonScope.bean.Vehicle;
import org.example.singletonScope.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
   public static void main(String[] args){

       var context=new AnnotationConfigApplicationContext(AppConfig.class);
//       var person=context.getBean(Person.class);
//       var person1=context.getBean(Person.class);
//       System.out.println(person.getVeh().getName());
//       System.out.println(person.hashCode());
//       System.out.println(person1.hashCode());
//
//       if(person1==person){
//           System.out.println("Person bean has singleton scoped");
//       }

       System.out.println("Before vehicle bean created");
      // var vehicle=context.getBean(Vehicle.class);
       System.out.println("After vehicle bean created");
    }
}