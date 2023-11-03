package me.gamenu.hfcnotificator;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SettingsView extends AnchorPane {

    Stage stage;

    FXMLLoader loader;

    public SettingsView(Stage stage) throws IOException {
        this.loader = new FXMLLoader(SettingsView.class.getResource("settings-view.fxml"));
        this.loader.load();

        this.stage = stage;

    }

    public FXMLLoader getLoader() {
        return loader;
    }
}
