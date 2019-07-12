package com.github.ffmammadov.observer.observable;

import com.github.ffmammadov.observer.observer.Observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NewsAgency implements Observable {

    private Set<Observer> subscribers;
    private List<String> news;

    public NewsAgency() {
        subscribers = new HashSet<>();
        news = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer != null) {
            //adding subscribers
            subscribers.add(observer);
        }
    }

    @Override
    public void remove(Observer observer) {
        if (observer != null) {
            //removing subscribers
            subscribers.remove(observer);
        }
    }

    @Override
    public void sendUpdate() {
        //send notification about change
        subscribers.forEach(Observer::update);
    }


    public void addNews(String news) {
        if (news != null) {
            //changing state
            this.news.add(news);
            //and notifying subscribers
            sendUpdate();
        }
    }

    public List<String> getNews() {
        //return read-only data
        return Collections.unmodifiableList(news);
    }
}
