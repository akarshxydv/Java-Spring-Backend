package org.example.implementation.music;

import org.example.interfaces.MusicService;
import org.springframework.stereotype.Component;

@Component
public class JBLMusic implements MusicService {
    public String makeSound() {
        return "JBLMusic music is installed in Car";
    }
}
