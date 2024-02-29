package withoutAOP.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import withoutAOP.beans.Vehicle_Services;
import withoutAOP.config.AppConfig;
import withoutAOP.domain.Song;

public class Main {
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(AppConfig.class);
        var vehSer=context.getBean(Vehicle_Services.class);
        Song s1=new Song();
        s1.setArtistName("Arman malik");
        s1.setSongName("Tu chala Ja");
        boolean vehicleStarted=true;
        String vehicleMoving=vehSer.moveVehicle(vehicleStarted);
        String vehicleSong=vehSer.playMusic(vehicleStarted,s1);
        String vehiclebreak=vehSer.applyBrake(vehicleStarted);

    }
}
