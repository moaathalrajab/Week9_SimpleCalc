package com.mycompany.week9_simplecalc_demo;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField tf_Output;
    @FXML
    private Button btnDvd;
    @FXML
    private Button btnMlt;
    @FXML
    private Button btnSub;
    @FXML
    private Button btnEql;
    @FXML
    private Button btnAdd;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void processDigit(ActionEvent event) {
    }

    @FXML
    private void processArthOp(ActionEvent event) {
    }

    @FXML
    private void processEqual(ActionEvent event) {
    }
}
