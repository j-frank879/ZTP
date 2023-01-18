package com.example.kawiarnia;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private List<Napoj> zamowienie;

    Memento(List<Napoj> zamowienie) {
        this.zamowienie = new ArrayList<>(zamowienie);
    }

    public List<Napoj> getZamowienie() {
        return zamowienie;
    }


}
