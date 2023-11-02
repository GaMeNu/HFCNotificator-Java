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

public class MainView{

    @FXML
    Label tv_alertZone;

    @FXML
    ImageView img_alertStatus;

    @FXML
    HBox hbox_alertZones;

    public MainView(Stage stage) throws IOException {
        BackgroundTask task = new BackgroundTask();
        task.setStage(stage);
        Thread backgroundThread = task.create();

        Scene scene = getMainScene(stage);

        setScene(stage, scene, "HFC Notificator Desktop");

        stage.show();

    }

    public static Scene getMainScene(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainView.class.getResource("main-view.fxml"));
        Rectangle2D bounds = Screen.getPrimary().getBounds();
        Scene scene = new Scene(fxmlLoader.load(), bounds.getMaxX(), bounds.getMaxY());
        MainController controller = fxmlLoader.getController();
        controller.setStage(stage);
        return scene;
    }
    
    public void setScene(Stage stage, Scene scene, String title){
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.setTitle(title);
    }
}
