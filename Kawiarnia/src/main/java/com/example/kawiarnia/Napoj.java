package com.example.kawiarnia;

import java.util.ArrayList;


public abstract class Napoj {
    public String nazwa;
    // private ArrayList<String> skladniki;
    private float cena;
    private String baza;
    private int tempWody;
    private String rodzajNaczynia;
    private int czasParzenia;

    public Napoj() {
        cena = 0;
    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

//    public String opisSkladu() {
//        String s = "";
//        for (String skladnik : skladniki) {
//            s += skladnik + " ";
//        }
//        return s;
//    }

//    public ArrayList<String> getSkladniki() {
//        return skladniki;
//    }
//
//    public void dodajSkladnik(String skladnik) {
//        skladniki.add(skladnik);
//    }

    public float getCena() {
        return cena;
    }

    public abstract float cost();

    public void addValue(float cena) {
        this.cena += cena;
    }

    //nie ma interfejsu Prototype, zamiast tego jest metoda abstrakcyjna(tak lepiej bo jest dziedziczenie z Napoju)
    public abstract Napoj clone();


    public void setBaza(String baza) {
        this.baza = baza;
    }

    public void setTempWody(int tempWody) {
        this.tempWody = tempWody;
    }

    public void setRodzajNaczynia(String rodzajNaczynia) {
        this.rodzajNaczynia = rodzajNaczynia;
    }

    public void setCzasParzenia(int czasParzenia) {
        this.czasParzenia = czasParzenia;
    }

    public String getBaza() {
        return baza;
    }

    public int getTempWody() {
        return tempWody;
    }

    public String getRodzajNaczynia() {
        return rodzajNaczynia;
    }

    public int getCzasParzenia() {
        return czasParzenia;
    }

    @Override
    public String toString() {
        return
                "nazwa='" + nazwa + '\'' +
                        ", cena=" + cena;
    }
}
