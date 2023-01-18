package com.example.kawiarnia;

public class Mleko extends Dodatek {
    Mleko(Napoj n) {
        super(n);
    }

    @Override
    float getCena() {
        return (float) (super.getCena() + 0.5);
    }

    @Override
    public String toString() {
        return super.toString() + " +mleko=" + getCena();
    }


}
