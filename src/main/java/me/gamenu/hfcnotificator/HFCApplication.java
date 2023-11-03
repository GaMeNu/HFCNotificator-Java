package me.gamenu.hfcnotificator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Stage;
import me.gamenu.hfcnotificator.stage.StageContext;

import java.io.IOException;

public class HFCApplication extends Application {

    public void startApp(){
        launch();
    }
    @Override
    public void start(Stage stage) throws IOException {
        StageContext stageContext = new StageContext(stage);

        stage.setMaximized(true);
        stage.setTitle("Home Front Command Notificator");
        MainView view = new MainView(stageContext);
        Scene mainScene = new Scene(view.getLoader().getRoot(), Globals.defaultScreenX, Globals.defaultScreenY);
        stageContext.setScene(mainScene);
        stage.show();
    }
}