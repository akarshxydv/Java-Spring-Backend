package org.example.aopYT.people;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    public void company(){
        System.out.println("Ram will start working in TCS");
    }
}
