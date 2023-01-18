package com.example.kawiarnia;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    public ComboBox platnosci;
    public Button ostatnie_zamowienie;
    public Button ostatni_napoj;

    public Button zaplac;
    public ImageView slide;
    public TextArea zamowienie_tresc;
    @FXML
    private Label rachunek;

    Zamowienie zamowienie;

    Director director;


Caretaker caretaker;
BudowniczyHerbata b_herbata;
BudowniczyKawa b_kawa;

Napoj ostatniNapoj;


    public void initialize() {
        platnosci.setItems(FXCollections.observableArrayList(
                "BLIK","Karta","Gotówka"
        ));
        platnosci.getSelectionModel().select(0);
        zamowienie=new Zamowienie();
        zamowienie.zmienSposobPlatnosci(new Platnosc_BLIK());
        director=new Director();
        caretaker=new Caretaker(zamowienie);

        rachunek.setText("Do zapłaty: 0.00");

    }



    @FXML
    protected void onEspressoClick() {
        BudowniczyKawa espresso = new BudowniczyKawa();
        director.zrobKawe(espresso);
        espresso.nazwa("Espresso").cena(5.50f).baza("ziarna").czasParzenia(3).rodzajNaczynia("CoffieCup");
        System.out.println(espresso.build());
        zamowienie.dodaj(espresso.build());

        zamowienie_tresc.setText(zamowienie.trescZamowienie());
        rachunek.setText("Do zapłaty: "+zamowienie.getWartosc());

    }
    @FXML
    protected void onMacchiatoClick() {
        BudowniczyKawa macchiato = new BudowniczyKawa();
        director.zrobKawe(macchiato);
        macchiato.nazwa("Macchiato").cena(6.50f).czasParzenia(4);
        System.out.println(macchiato.build());
        zamowienie.dodaj(macchiato.build());
    }
    @FXML
    protected void onCappuccinoClick() {
        BudowniczyKawa cappucino = new BudowniczyKawa();
        director.zrobKawe(cappucino);
        cappucino.nazwa("Cappuccino").cena(4.80f).czasParzenia(5);
        System.out.println(cappucino.build());
        zamowienie.dodaj(cappucino.build());
    }
    @FXML
    protected void onZielonaClick() {
        BudowniczyHerbata zielona = new BudowniczyHerbata();
        director.zrobHerbate(zielona);
        zielona.nazwa("Zielona Herbata").cena(3.50f).czasParzenia(7);
        System.out.println(zielona.build());
        zamowienie.dodaj(zielona.build());
    }
    @FXML
    protected void onZ_ImbiremClick() {
        BudowniczyHerbata imbirowa = new BudowniczyHerbata();
        director.zrobHerbate(imbirowa);
        imbirowa.nazwa("Herbata z imbirem").cena(5.0f).baza("lipton").czasParzenia(8);
        System.out.println(imbirowa.build());
        zamowienie.dodaj(imbirowa.build());
    }
    @FXML
    protected void onZ_CytrynaClick() {
        BudowniczyHerbata cytrynowa = new BudowniczyHerbata();
        director.zrobHerbate(cytrynowa);
        cytrynowa.nazwa("Herbata z cytryną").baza("lipton").cena(5.50f);
        System.out.println(cytrynowa.build());
        zamowienie.dodaj(cytrynowa.build());
    }
    @FXML
    protected void onOstatniNapojClick() {
        if(zamowienie.getLista().size() > 0){
            //clonuje z listy zamowienia ostatnio dodany napoj
            Napoj nowyNapoj = zamowienie.getLista().get(zamowienie.getLista().size() - 1).clone();
            zamowienie.dodaj(nowyNapoj);

            //to poprawiane bedzie pewnie
            zamowienie_tresc.setText(zamowienie.trescZamowienie());
            rachunek.setText("Do zapłaty: "+zamowienie.getWartosc());
        }
    }
    @FXML
    protected void onOstatnieZamowienieClick() {

    caretaker.cofnij();
    zamowienie_tresc.setText(zamowienie.trescZamowienie());
        rachunek.setText("Do zapłaty: "+zamowienie.getWartosc());
}

    @FXML
    protected void zmianaSposobuPlatnosci(){
        String s= (String) platnosci.getSelectionModel().getSelectedItem();
        if(s.compareTo("BLIK")==0)
        {zamowienie.zmienSposobPlatnosci(new Platnosc_BLIK());

        }
        else if (s.compareTo("Karta")==0)
        {zamowienie.zmienSposobPlatnosci(new Platnosc_karta());

        }
        else
        {zamowienie.zmienSposobPlatnosci(new Platnosc_gotowka());

        }

    }
    @FXML
    protected void zaplac(){
caretaker.zapisz(zamowienie.save());
zmianaSposobuPlatnosci();
zamowienie.zaplac();
zamowienie.clearZamowienie();
zamowienie_tresc.setText(zamowienie.trescZamowienie());
rachunek.setText("Do zapłaty: 0.00");
    }
}