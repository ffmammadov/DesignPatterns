package com.github.ffmammadov.creational.factorymethod.product;

public class WavAudio extends BaseAudio {


    protected WavAudio(String name) {
        super(name, ".wav");
    }

    @Override
    public void play() {
        System.out.println("Playing: " + getNameWithExtension());
    }
}
