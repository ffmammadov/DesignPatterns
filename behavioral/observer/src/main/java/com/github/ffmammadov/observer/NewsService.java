package com.github.ffmammadov.observer;

import com.github.ffmammadov.observer.observable.NewsAgency;
import com.github.ffmammadov.observer.observer.NewsFeed;
import com.github.ffmammadov.observer.observer.Website;

public class NewsService {

    public static void start() {
        var newsletter = new NewsAgency();

        var subscriber1 = new NewsFeed(newsletter);
        var subscriber2 = new Website(newsletter);

        newsletter.register(subscriber1);
        newsletter.register(subscriber2);

        newsletter.addNews("Iron man costume is ready to use!");
        newsletter.remove(subscriber1);
        newsletter.addNews("Thanos wants to destroy the half of universe!");
    }

    public static void main(String[] args) {
        NewsService.start();
    }
}
