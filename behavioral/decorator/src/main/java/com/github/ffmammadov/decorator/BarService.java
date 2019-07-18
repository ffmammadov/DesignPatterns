package com.github.ffmammadov.decorator;

public class BarService {
    public static void main(String[] args) {
        Cocktail boom = new Vodka(new Tequila(new Scotch(new Cola())));
        System.out.println(boom.order());
    }
}
