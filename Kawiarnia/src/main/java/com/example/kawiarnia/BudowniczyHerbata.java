package com.example.kawiarnia;

public class BudowniczyHerbata implements Budowniczy {
    private String nazwa;
    private float cena;
    private String baza;
    private int tempWody;
    private String rodzajNaczynia;
    private int czasParzenia;


    @Override
    public BudowniczyHerbata nazwa(String nazwa) {
        this.nazwa = nazwa;
        return this;
    }

    @Override
    public BudowniczyHerbata cena(float cena) {
        this.cena = cena;
        return this;
    }

    @Override
    public BudowniczyHerbata baza(String baza) {
        this.baza = baza;
        return this;
    }

    @Override
    public BudowniczyHerbata tempWody(int tempWody) {
        this.tempWody = tempWody;
        return this;
    }

    @Override
    public BudowniczyHerbata rodzajNaczynia(String rodzajNaczynia) {
        this.rodzajNaczynia = rodzajNaczynia;
        return this;
    }

    @Override
    public BudowniczyHerbata czasParzenia(int czasParzenia) {
        this.czasParzenia = czasParzenia;
        return this;
    }

    public Herbata build() {
        return new Herbata(nazwa, cena, baza, tempWody, rodzajNaczynia, czasParzenia);
    }
}
