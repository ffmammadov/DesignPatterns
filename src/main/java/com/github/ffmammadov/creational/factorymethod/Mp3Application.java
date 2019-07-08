package com.github.ffmammadov.creational.factorymethod;

import java.util.List;

public class Mp3Application {
    private Player player;

    public Mp3Application() {
        var nothingElseMatters = new Mp3Audio("Nothing else matters");
        var knockingOnHeavensDoor = new Mp3Audio("Knocking on Heaven's door");
        this.player = new Player(List.of(nothingElseMatters, knockingOnHeavensDoor));
    }

    public void playMp3() {
        player.play();
    }

    public static void main(String[] args) {
        Mp3Application application = new Mp3Application();
        application.playMp3();
    }
}
