package com.example.kawiarnia;

public class Cukier extends Dodatek {
    public Cukier(Napoj n) {
        super(n);
    }

    @Override
    float getCena() {
        return (float) (super.getCena()+0.5);
    }

//    @Override
//    String opisSkladu() {
//        return super.opisSkladu()+"cukier ";
//    }
}
