package me.gamenu.hfcnotificator;

import javafx.application.Application;
import javafx.stage.Stage;

public class HFCStart extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        MainView view = new MainView(stage);

    }
}
