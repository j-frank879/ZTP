package com.example.kawiarnia;

public class BudowniczyKawa implements Budowniczy {
    private String nazwa;
    private float cena;
    private String baza;
    private int tempWody;
    private String rodzajNaczynia;
    private int czasParzenia;


    @Override
    public BudowniczyKawa nazwa(String nazwa) {
        this.nazwa = nazwa;
        return this;
    }

    @Override
    public BudowniczyKawa cena(float cena) {
        this.cena = cena;
        return this;
    }

    @Override
    public BudowniczyKawa baza(String baza) {
        this.baza = baza;
        return this;
    }

    @Override
    public BudowniczyKawa tempWody(int tempWody) {
        this.tempWody = tempWody;
        return this;
    }

    @Override
    public BudowniczyKawa rodzajNaczynia(String rodzajNaczynia) {
        this.rodzajNaczynia = rodzajNaczynia;
        return this;
    }

    @Override
    public BudowniczyKawa czasParzenia(int czasParzenia) {
        this.czasParzenia = czasParzenia;
        return this;
    }

    public Kawa build() {
        return new Kawa(nazwa, cena, baza, tempWody, rodzajNaczynia, czasParzenia);
    }
}
