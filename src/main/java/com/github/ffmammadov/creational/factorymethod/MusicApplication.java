package com.github.ffmammadov.creational.factorymethod;

import com.github.ffmammadov.creational.factorymethod.client.Player;
import com.github.ffmammadov.creational.factorymethod.product.Audio;
import com.github.ffmammadov.creational.factorymethod.product.AudioRecorder;

import java.util.List;

public class MusicApplication {

    private Player player;

    public List<Audio> getMusic() {
        Audio sample = AudioRecorder.record("sample", ".mp3");
        Audio sound = AudioRecorder.record("voice", ".wav");
        return List.of(sample, sound);
    }

    public void start() {
        if (player == null) {
            player = new Player(getMusic());
        }
        player.play();
    }


    public static void main(String[] args) {
        MusicApplication application = new MusicApplication();
        application.start();
    }
}
