package com.example.kawiarnia;

import com.example.kawiarnia.Iterator;
import com.example.kawiarnia.Napoj;

import java.util.List;

public class ListIterator implements Iterator {

    private List<Napoj> zamowienie;
    private int index;

    ListIterator(List zamowienie) {
        this.zamowienie = zamowienie;
        this.index = 0;
    }

    @Override
    public void first() {
        this.index = 0;
    }

    @Override
    public void next() {
        this.index += 1;
    }

    @Override
    public boolean isDone() {
        if (this.zamowienie.size() >= this.index + 1) {
            return false;
        }
        return true;
    }

    @Override
    public Napoj currentItem() {

        return this.zamowienie.get(this.index);

    }
}
