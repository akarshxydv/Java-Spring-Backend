package org.example.services;

import org.example.interfaces.MusicService;
import org.example.interfaces.TyerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    @Autowired
    private MusicService music;
    private TyerServices tyre;

    public void playMusic(){
        String musics = music.makeSound();
        System.out.println(musics);
    }
    public void aboutTyre(){
        String tyres=tyre.tyreBrand();
        System.out.println(tyres);
    }
    public MusicService getMusic() {
        return music;
    }

    public void setMusic(MusicService music) {
        this.music = music;
    }

    public TyerServices getTyre() {
        return tyre;
    }

    @Autowired
    public void setTyre(TyerServices tyre) {
        this.tyre = tyre;
    }
}
