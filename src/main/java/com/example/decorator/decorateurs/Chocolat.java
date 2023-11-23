package com.example.decorator.decorateurs;

import com.example.decorator.boissons.Boisson;

public class Chocolat extends DecorateurBoisson{
    public Chocolat(Boisson boisson) {
        super(boisson);
    }
    @Override
    public double cout() {
        return 2+boisson.cout();
    }
    @Override
    public String getDescription() {
        return boisson.getDescription()+" au Chocolat";
    }
}
