package com.example.kawiarnia;

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
    public Button z_imbir;
    public Button zaplac;
    public ImageView slide;
    public TextArea zamowienie;

    @FXML
    private Label rachunek;

    @FXML
    private Button espresso;

    @FXML
    private Button cappuccino;

    @FXML
    private Button macchiato;



    @FXML
    private Button zielona;
    private Button z_imbirem;

    @FXML
    private Button z_cytryna;


    @FXML
    protected void onEspressoClick() {
        rachunek.setText("Welcome to JavaFX Application!");
    }
}