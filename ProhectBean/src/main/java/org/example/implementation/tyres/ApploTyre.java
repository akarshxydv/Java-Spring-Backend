package org.example.implementation.tyres;

import org.example.interfaces.TyerServices;
import org.springframework.stereotype.Component;

@Component
public class ApploTyre implements TyerServices {
    public String tyreBrand() {
        return "Applo tyre is installed in the system";
    }
}
