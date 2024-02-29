package withoutAOP.implementation;

import org.springframework.stereotype.Component;
import withoutAOP.interfaces.Tyres;

@Component
public class CEATTyres implements Tyres {

    public String rotate() {
        return "Vehicles tyres is rotating with the help of CEAT Tyres";
    }

    public String stop() {
        return  "CEAT  tyres is stopped" ;
    }
}
