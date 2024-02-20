package component.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    private void name(){
        this.name="Mahindra";
    }

    @PreDestroy
    private void destroy(){
        System.out.println("All bean has been destroyed");
    }

    public void printHello(){
        System.out.println("Printing Hello from the component Vehicle bean");
    }
}
