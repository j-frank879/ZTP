package com.example.kawiarnia;

import java.util.Iterator;
import java.util.List;

public class Zamowienie {
   private List<Napoj> zamowienie;
private Platnosc platnosc;

float getWartosc(){return 1;}

 void powtorz_ostatnie()
 {}
 void zaplac(){

 }
 Memento save()
 {return new Memento(zamowienie);

 }
 void restore(Memento m)
 {zamowienie=m.getZamowienie();

 }
 //Iterator createIterator(){}

    void zmienSposobPlatnosci(Platnosc p){
    platnosc=p;

    }
}
