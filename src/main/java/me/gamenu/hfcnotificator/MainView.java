package me.gamenu.hfcnotificator;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class MainView extends Application {

    @FXML
    Label tv_alertZone;

    @FXML
    ImageView img_alertStatus;

    @FXML
    HBox hbox_alertZones;

    public static void launchApp(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainView.class.getResource("main-view.fxml"));
        Rectangle2D bounds = Screen.getPrimary().getBounds();
        Scene scene = new Scene(fxmlLoader.load(), bounds.getMaxX(), bounds.getMaxY());
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.setTitle("Hello world!");

        stage.show();

    }
}
