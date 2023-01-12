package com.example.kawiarnia;

import java.util.List;

public class Memento {
    private List<Napoj> zamowienie;

    Memento(List<Napoj> zamowienie)
    {this.zamowienie=zamowienie;}

    public List<Napoj> getZamowienie() {
        return zamowienie;
    }

    public void setZamowienie(List<Napoj> zamowienie) {
        this.zamowienie = zamowienie;
    }
}
