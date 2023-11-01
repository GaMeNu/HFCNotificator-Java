package me.gamenu.hfcnotificator;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;

public class SettingsView extends AnchorPane {

    private FXMLLoader loader;

    public SettingsView(){
        this.loader = new FXMLLoader(SettingsView.class.getResource("settings-view.fxml"));
        this.loader.setController(new SettingsController());
    }

    public FXMLLoader getLoader() {
        return loader;
    }

    @FXML
    private void initialize(URL location, ResourceBundle resources){

    }
}
