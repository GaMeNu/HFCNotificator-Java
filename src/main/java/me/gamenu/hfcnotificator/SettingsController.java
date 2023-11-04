package me.gamenu.hfcnotificator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import me.gamenu.hfcnotificator.stage.StageContext;

public class SettingsController {

    @FXML
    ComboBox<String> cb_regSelect;

    @FXML
    Button btn_regAdd;

    @FXML
    ListView<String> lv_selectedRegs;

    @FXML
    Button btn_back;

    StageContext stageContext;

    public void setStageContext(StageContext stageContext) {
        this.stageContext = stageContext;
    }

    public void onBtnBackClick(ActionEvent actionEvent) {
        stageContext.previousPage();
    }
}
