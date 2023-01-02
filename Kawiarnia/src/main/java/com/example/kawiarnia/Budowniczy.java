package com.example.kawiarnia;

public interface Budowniczy {
     void reset();
     void dodajWody();
     void dodajNaparu();
     void dodajLod();
     void dodajPrzyprawy();
     void dodajMleko();
     void dodajCukier();
     Napoj getResult();
}
