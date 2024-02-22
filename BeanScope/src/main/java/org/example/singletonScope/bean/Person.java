package org.example.singletonScope.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class Person {
    private String name="Arnav";

    @Autowired
    private Vehicle veh;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVeh() {
        return veh;
    }

    public void setVeh(Vehicle veh) {
        this.veh = veh;
    }
}
