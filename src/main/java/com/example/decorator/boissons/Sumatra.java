package com.example.decorator.boissons;

public class Sumatra extends Boisson{
    @Override
    public double cout() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Suamtra";
    }
}
