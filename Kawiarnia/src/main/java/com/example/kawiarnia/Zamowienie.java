package com.example.kawiarnia;

import java.util.ArrayList;
import java.util.List;

public class Zamowienie {
    private List<Napoj> zamowienie;
    private List<Dodatek> dodatki;
    private Platnosc platnosc;

    Zamowienie() {
        this.zamowienie = new ArrayList<>();
        this.dodatki = new ArrayList<>();
    }

    public void dodaj(Napoj napoj) {
        this.zamowienie.add(napoj);
    }

    public Iterator createIterator() {
        return new ListIterator(this.zamowienie);
    }

    float getWartosc() {
        float wartosc = 0;
        for (Napoj n : zamowienie
        ) {
            wartosc += n.getCena();

        }
        return wartosc;

    }


    String trescZamowienie() {
        String s = "";
        for (Napoj n :
                zamowienie) {
            s += n.toString();
            s += '\n';
        }
        return s;
    }

    void zaplac() {
        platnosc.zaplac();

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

    public void clearZamowienie() {
        zamowienie.clear();
    }

    public List<Napoj> getLista() {
        return this.zamowienie;
    }

    public void dodajDodatki(Dodatek d) {
        dodatki.add(d);
    }
    public void clearDodatki(){dodatki.clear();}
}



