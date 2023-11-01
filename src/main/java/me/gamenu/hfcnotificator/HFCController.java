package me.gamenu.hfcnotificator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class HFCController {
    @FXML
    private Label welcomeText;
    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    protected void onHelloButtonClick(ActionEvent event) throws IOException {
        SettingsView settingsView = new SettingsView();
        Rectangle2D bounds = Screen.getPrimary().getBounds();
        Scene settingsScene = new Scene(settingsView.getLoader().load(), bounds.getMaxX(), bounds.getMaxY());
        stage.setScene(settingsScene);
        stage.setMaximized(true);
        stage.setTitle("assgasafadg");
    }
}