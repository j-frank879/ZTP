package com.example.kawiarnia;

public class Kawa extends Napoj {


    Kawa(String nazwa, float cena, String baza, int tempWody, String rodzajNaczynia, int czasParzenia){
        this.setNazwa(nazwa);
        this.addValue(cena);
        this.setBaza(baza);
        this.setTempWody(tempWody);
        this.setRodzajNaczynia(rodzajNaczynia);
        this.setCzasParzenia(czasParzenia);

    }

    //dodatkowy konstruktor potrzebny do klonowania
    Kawa(Kawa kawa){
        this.setNazwa(kawa.getNazwa());
        this.addValue(kawa.getCena());
        this.setBaza(kawa.getBaza());
        this.setTempWody(kawa.getTempWody());
        this.setRodzajNaczynia(kawa.getRodzajNaczynia());
        this.setCzasParzenia(kawa.getCzasParzenia());
    }


    @Override
    public Napoj clone() {
        return new Kawa(this);
    }
}
