package ru.sokolova.sokolova_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private Label NL;

    @FXML
    private TextField NT;

    @FXML
    void bt(ActionEvent event) {
        int N=Integer.parseInt(NT.getText().toString());
        if (N <= 0) {
            NL.setText("N>0.");
            return;
        }

        StringBuilder r = new StringBuilder();

        while (N > 0) {
            int d = N % 10;
            r.append(d).append(" ");
            N /= 10;
        }
        NL.setText("N="+r);
    }

}
