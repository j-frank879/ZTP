package com.example.kawiarnia;

public class Kawa extends Napoj {

    Kawa(String nazwa, float cena){
        this.setNazwa(nazwa);
        this.addValue(cena);
    }

    //dodatkowy konstruktor potrzebny do klonowania
    Kawa(Kawa kawa){
        this.setNazwa(kawa.getNazwa());
        this.addValue(kawa.getCena());
    }

    @Override
    public Napoj clone() {
        return new Kawa(this);
    }
}
