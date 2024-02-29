package withoutAOP.implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import withoutAOP.domain.Song;
import withoutAOP.interfaces.Speakers;

@Component
@Primary
public class JBLSpeaker implements Speakers {
    public String makeSound(Song song) {
        return "Playing the song"+" "+song.getSongName() +" "+"and sung by"+song.getArtistName()+" playing in JBL Speaker";
    }
}
