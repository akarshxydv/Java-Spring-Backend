package org.example.withAOP.implementations;

import org.example.withAOP.domain.Song;
import org.example.withAOP.interfaces.VehicleBody;
import org.springframework.stereotype.Component;

@Component
public class BlackColor implements VehicleBody {
    @Override
    public String bodyColor(Song song) {
        return "Your Car is coated with Black Color";
    }


}
