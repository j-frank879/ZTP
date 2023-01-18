package com.example.kawiarnia;

public class Director {
    public void zrobKawe(Budowniczy b) {
        b.nazwa("Czarna")
                .cena(4.50f)
                .baza("ziarna")
                .tempWody(98)
                .rodzajNaczynia("filiżanka")
                .czasParzenia(360);
    }

    public void zrobHerbate(Budowniczy b) {
        b.nazwa("Zielona")
                .cena(3.50f)
                .baza("szusz")
                .tempWody(90)
                .rodzajNaczynia("kubek")
                .czasParzenia(540);
    }


}
