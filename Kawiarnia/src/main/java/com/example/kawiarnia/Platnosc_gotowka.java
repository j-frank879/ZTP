package com.example.kawiarnia;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Platnosc_gotowka implements Platnosc {
    float reszta;

    @Override
    public void zaplac() {

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);

        TextField text1 = new TextField();

        Button button = new Button("Zapłać");
        button.setOnAction(e -> {

            stage.close();
        });

        Label label1 = new Label(" Płatność gotówką: ");
        Label label2 = new Label("Gotówka:");


        GridPane layout = new GridPane();

        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(5);
        layout.setHgap(5);

        layout.add(text1, 1, 1);
        layout.add(button, 1, 3);
        layout.add(label1, 1, 0);
        layout.add(label2, 0, 1);


        Scene scene = new Scene(layout, 250, 150);
        stage.setTitle("Gotówka");
        stage.setScene(scene);
        stage.showAndWait();
    }
}
