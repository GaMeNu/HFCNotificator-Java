package me.gamenu.hfcnotificator;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import me.gamenu.hfcnotificator.stage.StageContext;

import java.io.IOException;

public class SettingsView extends AnchorPane {

    StageContext stageContext;

    FXMLLoader loader;

    public SettingsView(StageContext stageContext) throws IOException {
        this.loader = new FXMLLoader(SettingsView.class.getResource("settings-view.fxml"));
        this.loader.load();

        this.stageContext = stageContext;

    }

    public FXMLLoader getLoader() {
        return loader;
    }

    public void setStageContext(StageContext stageContext) {
        this.stageContext = stageContext;
        ((SettingsController) this.loader.getController()).setStageContext(stageContext);
    }
}
