package me.gamenu.hfcnotificator.stage;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class StageContext{

    SceneStack sceneStack;

    Stage stage;


    public StageContext(Stage stage){
        this.stage = stage;
        this.sceneStack = new SceneStack();
    }

    public SceneStack getSceneStack() {
        return sceneStack;
    }

    public Stage getStage() {
        return stage;
    }

    public void setScene(Scene scene){
        this.sceneStack.push(scene);
        this.stage.setScene(scene);
    }
}


