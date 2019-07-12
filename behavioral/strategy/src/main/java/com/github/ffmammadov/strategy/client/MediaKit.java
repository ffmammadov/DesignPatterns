package com.github.ffmammadov.strategy.client;

import com.github.ffmammadov.strategy.interfaces.player.Player;
import com.github.ffmammadov.strategy.interfaces.recorder.Recorder;

//Client
public class MediaKit {

    private final Player player;
    private final Recorder recorder;

    public MediaKit(Player player, Recorder recorder) {
        this.player = player;
        this.recorder = recorder;
    }

    public void play() {
        //encapsulating play algorithm
        player.play();
    }

    public byte[] record(String name) {
        //encapsulating record algorithm
        return recorder.record(name);
    }
}
