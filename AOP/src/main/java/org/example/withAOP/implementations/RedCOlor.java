package org.example.withAOP.implementations;

import org.example.withAOP.domain.Song;
import org.example.withAOP.interfaces.VehicleBody;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RedCOlor implements VehicleBody {

    @Override
    public String bodyColor(Song song) {
        return "Your Car is coated with Red Color"+" Music is playing "+song.name()+" "+song.artist();
    }


}
