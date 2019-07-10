package com.github.ffmammadov.behavioral.strategy;

import com.github.ffmammadov.behavioral.strategy.client.MediaKit;
import com.github.ffmammadov.behavioral.strategy.interfaces.player.MkvPlayer;
import com.github.ffmammadov.behavioral.strategy.interfaces.player.Mp3Player;
import com.github.ffmammadov.behavioral.strategy.interfaces.recorder.MkvRecorder;
import com.github.ffmammadov.behavioral.strategy.interfaces.recorder.Mp3Recorder;

import static java.nio.charset.StandardCharsets.UTF_8;

//All together
public class MediaService {
    public static void start() {
        var mp3Player = new Mp3Player("Nothing else matters".getBytes(UTF_8));
        var musicalMediaKit = new MediaKit(mp3Player, new Mp3Recorder());
        musicalMediaKit.play();
        System.out.println(new String(musicalMediaKit.record("Nickelback - Rockstar (Cover)")));

        var mkvPlayer = new MkvPlayer("Sample.mkv".getBytes(UTF_8));
        //The power of Strategy - code reuse
        var mixedMediaKit = new MediaKit(mkvPlayer, new Mp3Recorder());
        mixedMediaKit.play();
        System.out.println(new String(mixedMediaKit.record("Nirvana - Come As You Are (Cover)")));

        var mkvMediaKit = new MediaKit(mkvPlayer, new MkvRecorder());
        mkvMediaKit.play();
        System.out.println(new String(mkvMediaKit.record("Party"), UTF_8));

    }

    public static void main(String[] args) {
        MediaService.start();
    }
}
