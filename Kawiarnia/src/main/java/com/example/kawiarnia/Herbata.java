package com.example.kawiarnia;

public class Herbata extends Napoj {


    Herbata(String nazwa, float cena, String baza, int tempWody, String rodzajNaczynia, int czasParzenia){
        this.setNazwa(nazwa);
        this.addValue(cena);
        this.setBaza(baza);
        this.setTempWody(tempWody);
        this.setRodzajNaczynia(rodzajNaczynia);
        this.setCzasParzenia(czasParzenia);
    }

    //dodatkowy konstruktor potrzebny do klonowania
    Herbata(Herbata herbata){
        this.setNazwa(herbata.getNazwa());
        this.addValue(herbata.getCena());
        this.setBaza(herbata.getBaza());
        this.setTempWody(herbata.getTempWody());
        this.setRodzajNaczynia(herbata.getRodzajNaczynia());
        this.setCzasParzenia(herbata.getCzasParzenia());
    }

    @Override
    public Napoj clone() {
        return new Herbata(this);
    }

    public Herbata(){
        nazwa = "Herbata";
    }
    public float cost(){
        return 3.00f;
    };
}
