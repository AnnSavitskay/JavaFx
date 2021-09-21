package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.show();
        stage.setTitle("Hello world Application");
        stage.setWidth(600);
        stage.setHeight(600);
        Label label = new Label("Hello world");
        label.setAlignment(Pos.CENTER);
        Scene scene= new Scene(label);
        stage.setScene(scene);
    }

    public static void main(String[] args) {
        Application.launch();
    }
}