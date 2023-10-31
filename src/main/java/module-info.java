module me.gamenu.hfcnotificator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens me.gamenu.hfcnotificator to javafx.fxml;
    exports me.gamenu.hfcnotificator;
}