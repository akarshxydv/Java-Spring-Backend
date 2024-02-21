package org.example.implementation.music;

import org.example.interfaces.MusicService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseMusic implements MusicService {
    public String makeSound() {
        return "Bose music is installed in Car";
    }
}
