package com.example.flightgearjavafxjava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Model;
import view_model.ViewModel;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        BorderPane root =(BorderPane)fxmlLoader.load();
        Scene scene = new Scene(root, 300, 300);
        Model m = new Model("C:\\Users\\סהר\\Desktop\\MVVM\\FlightGearJavaFX - Java\\properties.txt");
        WindowController wc = (WindowController) fxmlLoader.getController();
        ViewModel vm = new ViewModel(m);
        wc.init(vm);
        wc.paint();

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}