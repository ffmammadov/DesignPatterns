package com.github.ffmammadov.decorator;

public class Vodka extends Cocktail {


    protected Vodka(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int order() {
        return 2 + getBeverage().order();
    }
}
