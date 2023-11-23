package com.example.decorator.decorateurs;

import com.example.decorator.boissons.Boisson;

public class Caramel extends DecorateurBoisson{
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 3+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au Caramel";
    }
}
