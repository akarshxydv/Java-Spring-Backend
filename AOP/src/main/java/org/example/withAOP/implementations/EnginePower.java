package org.example.withAOP.implementations;

import org.example.withAOP.interfaces.VehicleEngine;
import org.springframework.stereotype.Component;

@Component
public class EnginePower implements VehicleEngine {
    @Override
    public String engineBody() {
        return "2020 hp engine fitted in your car";
    }
}
