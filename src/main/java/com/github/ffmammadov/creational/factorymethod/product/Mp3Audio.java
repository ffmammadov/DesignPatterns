package com.github.ffmammadov.creational.factorymethod.product;

public class Mp3Audio extends BaseAudio {

    protected Mp3Audio(String name) {
        super(name, ".mp3");
    }

    @Override
    public void play() {
        //Decoding and playing .mp3 files
        System.out.println("Playing " + getNameWithExtension());
    }
}
