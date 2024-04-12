package org.example.withAOP.beans;
import org.example.withAOP.domain.Song;
import org.example.withAOP.interfaces.VehicleBody;
import org.example.withAOP.interfaces.VehicleEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    private String name;
    private int date;



    @Autowired
    private VehicleEngine vehicleEngine;

    public VehicleEngine getVehicleEngine() {
        return vehicleEngine;
    }

    public void setVehicleEngine(VehicleEngine vehicleEngine) {
        this.vehicleEngine = vehicleEngine;
    }

    @Autowired
    private VehicleBody vehicleBody;

    public String carBody(Song song){
        return vehicleBody.bodyColor(song);
    }
    public void ex(Song song){
        String car=carBody(song);
        System.out.println(car);
    }
    public VehicleBody getVehicleBody() {
        return vehicleBody;
    }

    public void setVehicleBody(VehicleBody vehicleBody) {
        this.vehicleBody = vehicleBody;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
