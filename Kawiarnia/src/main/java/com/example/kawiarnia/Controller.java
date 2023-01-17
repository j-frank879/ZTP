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


    public void initialize() {
        platnosci.setItems(FXCollections.observableArrayList(
                "BLIK","Karta","Gotówka"
        ));
        platnosci.getSelectionModel().select(0);
        zamowienie=new Zamowienie();
        director=new Director();
    }



    @FXML
    protected void onEspressoClick() {

    }
    @FXML
    protected void onMacchiatoClick() {

    }
    @FXML
    protected void onCappuccinoClick() {

    }
    @FXML
    protected void onZielonaClick() {

    }
    @FXML
    protected void onZ_ImbiremClick() {

    }
    @FXML
    protected void onZ_CytrynaClick() {

    }
    @FXML
    protected void onOstatniNapojClick() {

    }
    @FXML
    protected void onOstatnieZamowienieClick() {

    }
    @FXML
    protected void zmianaSposobuPlatnosci(){

    }
    @FXML
    protected void zaplac(){


    }
}