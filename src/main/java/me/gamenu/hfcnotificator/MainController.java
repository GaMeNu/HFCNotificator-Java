package me.gamenu.hfcnotificator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import me.gamenu.hfcnotificator.stage.StageContext;

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

    StageContext stageContext;


    public void onSettingsClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader settingsView = new FXMLLoader(MainController.class.getResource("settings-view.fxml"));

        Scene settingsScene = new Scene(settingsView.load());

        ((SettingsController) settingsView.getController()).setStageContext(stageContext);

        this.stageContext.setScene(settingsScene);

    }

    public void setStageContext(StageContext context) {
        this.stageContext = context;
    }
}

