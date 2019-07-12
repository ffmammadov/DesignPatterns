package com.github.ffmammadov.observer.observer;

import com.github.ffmammadov.observer.observable.NewsAgency;

public class NewsFeed implements Observer {
    private final NewsAgency newsAgency;

    public NewsFeed(NewsAgency newsAgency) {
        this.newsAgency = newsAgency;
    }

    @Override
    public void update() {
        System.out.println("Breaking news! On " + this.getClass().getSimpleName());
        newsAgency.getNews().forEach(System.out::println);
    }
}
