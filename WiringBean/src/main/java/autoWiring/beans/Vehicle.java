package autoWiring.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name="Toyota";
    public Vehicle(){
        System.out.println("Vehicle bean has been created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "The car name is :" + name;
    }

}
