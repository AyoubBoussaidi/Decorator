package com.example.decorator.decorateurs;

import com.example.decorator.boissons.Boisson;

public class Lait extends DecorateurBoisson {

    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 2+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au Lait";
    }
}
