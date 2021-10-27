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
        
        if(tf_Output.getText().endsWith("0")) tf_Output.setText("");
       

         switch(((Button)event.getSource()).getText()){
              case "1": tf_Output.setText(tf_Output.getText() + "1"); break;
              case "2": tf_Output.setText(tf_Output.getText() + "2"); break;
              case "3": tf_Output.setText(tf_Output.getText() + "3"); break;
              case "4": tf_Output.setText(tf_Output.getText() + "4"); break;
              case "5": tf_Output.setText(tf_Output.getText() + "5"); break;
              case "6": tf_Output.setText(tf_Output.getText() + "6"); break;
              case "7": tf_Output.setText(tf_Output.getText() + "7"); break;
              case "8": tf_Output.setText(tf_Output.getText() + "8"); break;
              case "9": tf_Output.setText(tf_Output.getText() + "9"); break;
              case "0": tf_Output.setText(tf_Output.getText() + "0"); break;
         }
         
         
    }

    @FXML
    private void processArthOp(ActionEvent event) {
    }

    @FXML
    private void processEqual(ActionEvent event) {
    }
}
