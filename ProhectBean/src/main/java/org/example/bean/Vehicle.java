package org.example.bean;

import org.example.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class Vehicle {
    private String name="Kia Seltos";
    private VehicleServices vs;
    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVs() {
        return vs;
    }

    public void setVs(VehicleServices vs) {
        this.vs = vs;
    }

    @Autowired
    public Vehicle(VehicleServices vs){
        this.vs=vs;
    }

    public String getName() {
        return name;
    }


}
