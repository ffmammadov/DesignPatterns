package com.github.ffmammadov.creational.factorymethod;

public class Mp3Audio extends BaseAudio {

    public Mp3Audio(String name) {
        super(name, ".mp3");
    }

    @Override
    public void play() {
        //Decoding and playing .mp3 files
        System.out.println("Playing " + getNameWithExtension());
    }
}
