package com.example.decorator.boissons;

public class Espresso extends Boisson{
    public String getDescription(){
        return "Espresso";
    }
    @Override
    public double cout() {
        return 7;
    }
}
