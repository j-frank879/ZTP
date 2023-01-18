package com.example.kawiarnia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CafeApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CafeApplication.class.getResource("menu.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 640 , 480);
        stage.setTitle("Kawiarnia");


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}