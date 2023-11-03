package me.gamenu.hfcnotificator;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import me.gamenu.hfcnotificator.stage.StageContext;

import java.io.IOException;

public class MainView extends AnchorPane {

    StageContext stageContext;
    FXMLLoader loader;

    public MainView(StageContext stageCtx) throws IOException {
        this.loader = new FXMLLoader(MainView.class.getResource("main-view.fxml"));
        this.loader.load();
        this.stageContext = stageCtx;
        MainController controller = this.loader.getController();
        controller.setStageContext(stageCtx);

    }

    public FXMLLoader getLoader() {
        return loader;
    }
}
