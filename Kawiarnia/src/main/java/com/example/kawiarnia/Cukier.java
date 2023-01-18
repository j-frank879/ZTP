package com.example.kawiarnia;

public class Cukier extends Dodatek {
    public Cukier(Napoj n) {
        super(n);
    }

    @Override
    float getCena() {
        return (float) (super.getCena() + 0.5);
    }

    @Override
    public String toString() {
        return super.toString() + " +cukier" + getCena();

    }

}
