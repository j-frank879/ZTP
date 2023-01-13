package com.example.kawiarnia;

public class Director {
    public void zrobKawe(Budowniczy b){
        b.nazwa("Czarna")
                .cena(4.01f)
                .baza("Kronung")
                .tempWody(98)
                .rodzajNaczynia("filiżanka")
                .czasParzenia(360);
    }
    public void zrobHerbate(Budowniczy b){
        b.nazwa("Zielona")
                .cena(3.01f)
                .baza("Lipton")
                .tempWody(90)
                .rodzajNaczynia("kubek")
                .czasParzenia(540);
    }
}
