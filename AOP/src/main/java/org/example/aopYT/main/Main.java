package org.example.aopYT.main;

import org.example.aopYT.config.AppConfig;
import org.example.aopYT.people.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
       var context=new AnnotationConfigApplicationContext(AppConfig.class);
       var st1=context.getBean(Student.class);
       st1.school();
       
    }
}
