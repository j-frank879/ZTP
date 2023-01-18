package com.example.kawiarnia;

public abstract class Dodatek {
    private Napoj napoj;

    Dodatek(Napoj n) {
        napoj=n;
    }
    float getCena() {
        return napoj.getCena();
    }
//    String opisSkladu() {
//        return napoj.opisSkladu();
//
//    }
}
