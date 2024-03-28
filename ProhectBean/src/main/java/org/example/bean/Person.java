package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
public class Person {
    private String name="Soumya Yadav";

    @Autowired
    private Vehicle vehicle;
//    @Autowired
//    public Person(Vehicle vehicle){
//        this.vehicle=vehicle;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


}
