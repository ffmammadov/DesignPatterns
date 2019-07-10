package com.github.ffmammadov.creational.factorymethod.factory;

import com.github.ffmammadov.creational.factorymethod.product.Audio;
import com.github.ffmammadov.creational.factorymethod.product.Mp3Audio;
import com.github.ffmammadov.creational.factorymethod.product.WavAudio;

/**
 * Class with Factory Method
 */
public class AudioRecorder {
    
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
