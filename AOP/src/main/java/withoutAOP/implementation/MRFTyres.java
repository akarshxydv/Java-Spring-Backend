package withoutAOP.implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import withoutAOP.interfaces.Tyres;

@Component
@Primary
public class MRFTyres implements Tyres {

    public String rotate() {
        return "Vehicles tyres is rotating with the help of MRF Tyres";
    }

    public String stop() {
        return "MRF tyres is stopped";
    }
}
