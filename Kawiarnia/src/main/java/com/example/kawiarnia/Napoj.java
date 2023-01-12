package com.example.kawiarnia;

import java.util.ArrayList;


public abstract class Napoj {
    private String nazwa;
    private ArrayList<String> skladniki;
    private float cena;

    public Napoj() {
        cena = 0;
    }

    public Napoj(Napoj n) {
        this.nazwa = nazwa;
        this.skladniki = new ArrayList<>(skladniki);

    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String opisSkladu() {
        String s = "";
        for (String skladnik : skladniki) {
            s += skladnik + " ";
        }
        return s;
    }

    public ArrayList<String> getSkladniki() {
        return skladniki;
    }

    public void dodajSkladnik(String skladnik) {
        skladniki.add(skladnik);
    }

    public float getCena() {
        return cena;
    }

    public void addValue(float cena) {
        this.cena += cena;
    }

    //nie ma interfejsu Prototype, zamiast tego jest metoda abstrakcyjna(tak lepiej bo jest dziedziczenie z Napoju)
    public abstract Napoj clone();
}
