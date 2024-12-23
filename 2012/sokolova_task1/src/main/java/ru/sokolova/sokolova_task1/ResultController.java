package ru.sokolova.sokolova_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private TextField aT;

    @FXML
    private Label day;

    @FXML
    void q(ActionEvent event) {
        int a=Integer.parseInt(aT.getText().toString());
        switch (a){
            case 1:
                day.setText("Понедельник");
                break;
            case 2:
                day.setText("Вторник");
                break;
            case 3:
                day.setText("Среда");
                break;
            case 4:
                day.setText("Четверг");
                break;
            case 5:
                day.setText("Пятница");
                break;
            case 6:
                day.setText("Суббота");
                break;
            case 7:
                day.setText("Воскресенье");
                break;
            default:
                day.setText("1-7");
        }


    }

}
