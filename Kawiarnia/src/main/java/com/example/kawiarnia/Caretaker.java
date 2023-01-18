package com.example.kawiarnia;

public class Caretaker {
    private Zamowienie zamowienie;
    private Memento memento;

    Caretaker(Zamowienie zamowienie)
    {this.zamowienie=zamowienie;}
    public void zapisz(Memento m)
    {memento=m;
System.out.println(memento);
    }
    public void cofnij()
    {if(memento==null)
    {System.out.println("memento is null");

    }
    else
    {zamowienie.restore(memento);

    }

    }

}
