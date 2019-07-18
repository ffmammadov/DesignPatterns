package com.github.ffmammadov.decorator;

//Decorator pattern. Cocktail is a Beverage and has a Beverage
public abstract class Cocktail implements Beverage {
    private Beverage beverage;

    protected Cocktail(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }
}
