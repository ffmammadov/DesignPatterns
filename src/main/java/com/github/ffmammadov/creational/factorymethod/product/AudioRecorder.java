package com.github.ffmammadov.creational.factorymethod.product;

/**
 * Class with Factory Method
 */
public class AudioRecorder {

    /**
     * FactoryMethod for Audio. Creates {@link Audio} for {@code type}
     * @param name Name of concrete audio
     * @param type type of concrete audio
     * @return new concrete instance of Audio.
     * @throws UnsupportedOperationException if type not supported
     */
    public static Audio record(String name, String type) {
        switch (type) {
            case ".mp3":
                return new Mp3Audio(name);
            case ".wav":
                return new WavAudio(name);
        }
        throw new UnsupportedOperationException(type + " not supported");
    }
}
