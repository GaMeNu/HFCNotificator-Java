package me.gamenu.hfcnotificator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SettingsController{

    @FXML
    private ComboBox<String> cb_regSelect;

    @FXML
    private Button btn_regAdd;

    @FXML
    private ListView<String> lv_selectedRegs;

}
