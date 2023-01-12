package com.example.kawiarnia;

import java.util.ArrayList;
import java.util.List;

public class Zamowienie {
    private List<Napoj> zamowienie;
    private Platnosc platnosc;

    Zamowienie(){
        this.zamowienie = new ArrayList<>();
    }

    public void dodaj(Napoj napoj){
        this.zamowienie.add(napoj);
    }

    public Iterator createIterator(){
        return new ListIterator(this.zamowienie);
    }

    float getWartosc() {
        return 1;
    }

    void powtorz_ostatnie() {
    }

    void zaplac() {

    }

    Memento save() {
        return new Memento(zamowienie);

    }

    void restore(Memento m) {
        zamowienie = m.getZamowienie();

    }

    void zmienSposobPlatnosci(Platnosc p) {
        platnosc = p;

    }
}



