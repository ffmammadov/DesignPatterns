package com.github.ffmammadov.decorator;

public class Tequila extends Cocktail {
    protected Tequila(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int order() {
        return 4 + getBeverage().order();
    }
}
