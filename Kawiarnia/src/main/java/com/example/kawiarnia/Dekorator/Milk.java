package com.example.kawiarnia.Dekorator;

import com.example.kawiarnia.Napoj;

public class Milk extends NapojDekorator{
    Napoj napoj;

    public Milk(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public Napoj clone() {
        return null;
    }

    @Override
    public String getNazwa() {
        return napoj.getNazwa()+ " z mlekiem";
    }

    @Override
    public float cost() {
        return napoj.cost()+0.75f;
    }
}
