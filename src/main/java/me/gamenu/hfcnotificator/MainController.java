package me.gamenu.hfcnotificator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    Label tv_alertZone;

    @FXML
    ImageView img_alertStatus;

    @FXML
    HBox hbox_alertZones;

    @FXML
    Button btn_settings;

    Stage stage;

    public void onSettingsClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader settingsView = new FXMLLoader(MainController.class.getResource("settings-view.fxml"));


        Scene settingsScene = new Scene(settingsView.load());

        this.stage.setScene(settingsScene);
        this.stage.setTitle("Settings");
        this.stage.setMaximized(true);

    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
