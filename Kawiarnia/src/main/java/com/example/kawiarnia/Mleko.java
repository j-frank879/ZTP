package com.example.kawiarnia;

public class Mleko extends Dodatek {
    Mleko(Napoj n) {
        super(n);
    }
    @Override
    float getCena() {
        return (float) (super.getCena()+0.5);
    }

//    @Override
//    String opisSkladu() {
//        return super.opisSkladu()+"mleko ";
//    }
}
