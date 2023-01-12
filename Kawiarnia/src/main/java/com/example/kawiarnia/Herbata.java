package com.example.kawiarnia;

public class Herbata extends Napoj {

    Herbata(String nazwa, float cena){
        this.setNazwa(nazwa);
        this.addValue(cena);
    }

    //dodatkowy konstruktor potrzebny do klonowania
    Herbata(Herbata herbata){
        this.setNazwa(herbata.getNazwa());
        this.addValue(herbata.getCena());
    }

    @Override
    public Napoj clone() {
        return new Herbata(this);
    }
}
