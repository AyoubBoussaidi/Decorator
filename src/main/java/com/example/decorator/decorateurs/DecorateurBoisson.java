package com.example.decorator.decorateurs;

import com.example.decorator.boissons.Boisson;

public abstract class DecorateurBoisson extends Boisson{
    protected Boisson boisson;
    public DecorateurBoisson(Boisson boisson) {
        this.boisson = boisson;
    }
}
