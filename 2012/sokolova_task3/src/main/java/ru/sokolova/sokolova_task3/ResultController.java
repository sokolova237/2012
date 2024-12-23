package ru.sokolova.sokolova_task3;
import static java.lang.Math.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private Label DL;

    @FXML
    private TextField ET;

    @FXML
    private Label LL;

    @FXML
    private Label RL;

    @FXML
    private Label SL;

    @FXML
    private TextField rdT;

    @FXML
    void bt(ActionEvent event) {
        int et = Integer.parseInt(ET.getText().toString());
        double R=0;
        switch (et) {
            case 1:
                R = et;
                break;
            case 2:
                R = et / 2;
                break;
            case 3:
                R = et / (2 * PI);
                break;
            case 4:
                R = (et / PI);
                break;
            default:
                RL.setText("1-4");


        }
        double D = 2 * R;
        double L = 2 * PI * R;
        double S = PI * R * R;
        RL.setText(String.format("R=%.2f",R));
        DL.setText(String.format("D=%.2f",D));
        LL.setText(String.format("R=%.2f",L));
        SL.setText(String.format("R=%.2f",S));
    }
}