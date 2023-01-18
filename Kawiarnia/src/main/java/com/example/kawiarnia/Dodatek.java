package com.example.kawiarnia;

public abstract class Dodatek {
    private Napoj napoj;

    Dodatek(Napoj n) {
        napoj = n;
    }

    float getCena() {
        return napoj.getCena();
    }

    @Override
    public String toString() {
        return napoj.toString();
    }


}
