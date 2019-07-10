package com.github.ffmammadov.behavioral.strategy.interfaces.recorder;

import static java.nio.charset.StandardCharsets.UTF_8;

public class MkvRecorder implements Recorder {
    @Override
    public byte[] record(String name) {
        return String.join(".", name, "mkv").getBytes(UTF_8);
    }
}
