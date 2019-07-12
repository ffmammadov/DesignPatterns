package com.github.ffmammadov.strategy.interfaces.recorder;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Mp3Recorder implements Recorder {
    @Override
    public byte[] record(String name) {
        return String.join("", name, "mp3").getBytes(UTF_8);
    }
}
