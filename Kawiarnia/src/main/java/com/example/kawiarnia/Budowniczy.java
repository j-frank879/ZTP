package com.example.kawiarnia;

public interface Budowniczy {

    Budowniczy nazwa(String nazwa);

    Budowniczy cena(float cena);

    Budowniczy baza(String baza);

    Budowniczy tempWody(int tempWody);

    Budowniczy rodzajNaczynia(String rodzajNaczynia);

    Budowniczy czasParzenia(int czasParzenia);
}
