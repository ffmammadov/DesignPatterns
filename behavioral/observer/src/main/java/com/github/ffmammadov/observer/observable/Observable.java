package com.github.ffmammadov.observer.observable;

import com.github.ffmammadov.observer.observer.Observer;

public interface Observable {
    void register(Observer observer);

    void remove(Observer observer);

    void sendUpdate();
}
