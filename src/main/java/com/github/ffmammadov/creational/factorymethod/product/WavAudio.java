package com.github.ffmammadov.creational.factorymethod;

public class WavAudio extends BaseAudio {


    public WavAudio(String name) {
        super(name, ".wav");
    }

    @Override
    public void play() {
        System.out.println("Playing: " + getNameWithExtension());
    }
}
