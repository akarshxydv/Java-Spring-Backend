package org.example.singletonScope.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Vehicle {
    private String name="Alto";

    public Vehicle(){
        System.out.println("Vehicle bean has been created by spring context");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
