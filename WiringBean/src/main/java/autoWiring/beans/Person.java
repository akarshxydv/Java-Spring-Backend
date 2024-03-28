package autoWiring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.security.PublicKey;

@Component
public class Person {

    @Autowired
    public Person(@Qualifier("veh3")  Vehicle veh1){
        System.out.println("Person bean has been created");
        this.vehicle=veh1;
    }
    private String name="Yadav ji";
    /*
        The @Autowired annotation marks on a field, constructor, Setter method
        is used to auto-wire the beans that is ‘injecting beans'(Objects) at runtime
        by Spring Dependency Injection mechanism
        * */
    //@Autowired           //if there is no bean for this class then you can @Autowored(required=false)  and by default it is true
    private  Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
  //  @Autowired     // you can use here to
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
