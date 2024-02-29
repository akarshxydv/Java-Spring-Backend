package withoutAOP.implementation;

import org.springframework.stereotype.Component;
import withoutAOP.domain.Song;
import withoutAOP.interfaces.Speakers;

@Component
public class BoseSpeaker implements Speakers {

    public String makeSound(Song song) {
        return "Playing the song"+" "+song.getSongName() +" "+"and sung by"+song.getArtistName()+" playing in Bose Speaker";
    }
}
