package com.github.ffmammadov.creational.factorymethod;

public abstract class BaseAudio implements Audio {
    private String name;
    private String type;

    public BaseAudio(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getNameWithExtension() {
        return name + type;
    }
}
