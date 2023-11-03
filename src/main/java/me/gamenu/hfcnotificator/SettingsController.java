package me.gamenu.hfcnotificator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

public class SettingsController {

    @FXML
    ComboBox<String> cb_regSelect;

    @FXML
    Button btn_regAdd;

    @FXML
    ListView<String> lv_selectedRegs;

}
