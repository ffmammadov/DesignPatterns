package com.github.ffmammadov.strategy.interfaces.player;

import java.nio.charset.StandardCharsets;

public class Mp3Player implements Player {

    private byte[] music;

    public Mp3Player(byte[] music) {
        this.music = music;
    }

    @Override
    public void play() {
        //Assume We have music decoding & playing algorithm here
        System.out.println("Playing music: " + new String(music, StandardCharsets.UTF_8));
    }
}
