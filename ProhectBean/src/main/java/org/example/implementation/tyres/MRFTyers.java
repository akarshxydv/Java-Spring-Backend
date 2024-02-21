package org.example.implementation.tyres;

import org.example.interfaces.TyerServices;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MRFTyers implements TyerServices {

    public String tyreBrand() {
        return "MRF Tyre installed in the car";
    }
}
