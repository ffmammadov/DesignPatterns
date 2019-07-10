package com.github.ffmammadov.creational.factorymethod.client;

import com.github.ffmammadov.creational.factorymethod.product.Audio;

import java.util.LinkedList;
import java.util.List;

public class Player {
    private List<Audio> audios;

    public Player(List<Audio> audios) {
        if (audios == null) {
            audios = new LinkedList<>();
        }
        this.audios = audios;
    }


    public void play() {
        audios.forEach(Audio::play);
    }

    public List<Audio> getAudios() {
        return audios;
    }
}
