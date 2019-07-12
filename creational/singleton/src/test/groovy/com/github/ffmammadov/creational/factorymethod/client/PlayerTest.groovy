package com.github.ffmammadov.creational.factorymethod.client


import com.github.ffmammadov.creational.factorymethod.product.Audio
import spock.lang.Specification

class PlayerTest extends Specification {
    Player player

    void setup() {
        player = new Player()
    }

    def "Play"() {
        given:
        def song1 = Mock(Audio)
        def song2 = Mock(Audio)
        player.audios.addAll(List.of(song1, song2))
        when:
        player.play()
        then:
        1 * song1.play()
        1 * song2.play()
    }
}
