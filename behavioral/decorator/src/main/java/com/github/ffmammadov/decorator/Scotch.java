package com.github.ffmammadov.decorator;

public class Scotch extends Cocktail {
    public Scotch(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int order() {
        return 50 + getBeverage().order();
    }
}
