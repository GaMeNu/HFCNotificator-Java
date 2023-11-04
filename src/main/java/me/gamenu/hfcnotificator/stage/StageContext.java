package me.gamenu.hfcnotificator.stage;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class StageContext{

    double prefWidth;
    double prefHeight;

    SceneStack sceneStack;

    Stage stage;


    public StageContext(Stage stage){
        this.stage = stage;

        this.stage.heightProperty().addListener((observable, oldValue, newValue) -> prefHeight = (double) newValue);
        this.stage.widthProperty().addListener((observable, oldValue, newValue) -> prefWidth = (double) newValue);

        this.sceneStack = new SceneStack();
    }

    public SceneStack getSceneStack() {
        return sceneStack;
    }

    public Stage getStage() {
        return stage;
    }

    protected void displayScene(Scene scene){
        this.stage.setScene(scene);
        if (stage.isMaximized()){
            stage.setMaximized(false);
            stage.setMaximized(true);
        }
    }

    public void setScene(Scene scene){
        this.sceneStack.push(scene);
        displayScene(scene);
    }

    public void previousPage(){
        Scene scene = sceneStack.back();
        displayScene(scene);

    }
}


