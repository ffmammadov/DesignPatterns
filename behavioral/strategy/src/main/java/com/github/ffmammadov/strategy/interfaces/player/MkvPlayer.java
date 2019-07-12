package com.github.ffmammadov.strategy.interfaces.player;

import java.nio.charset.StandardCharsets;

public class MkvPlayer implements Player {
    private byte[] video;

    public MkvPlayer(byte[] video) {
        this.video = video;
    }

    @Override
    public void play() {
        //Assume We have video decoding & displaying algorithm here
        System.out.println("Playing Video: " + new String(video, StandardCharsets.UTF_8));
    }
}
