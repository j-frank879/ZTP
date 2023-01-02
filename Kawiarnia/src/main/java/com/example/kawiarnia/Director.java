package com.example.kawiarnia;

public class Director {
    private Budowniczy budowniczy;

    Director(Budowniczy b)
    {budowniczy=b;}
    void setBudowniczy(Budowniczy b)
    {budowniczy=b;
    }
    Napoj make(String type)
    {
        return budowniczy.getResult();

    }
}
