package ru.sokolova.sokolova_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private TextField aT;

    @FXML
    private TextField bT;

    @FXML
    private Label card;

    @FXML
    void q(ActionEvent event) {
        int a = Integer.parseInt(aT.getText().toString());
        int b = Integer.parseInt(bT.getText().toString());


        String qw="";
        switch (b) {
            case 6:
                qw = "шестёрка";
                break;
            case 7:
                qw = "семёрка";
                break;
            case 8:
                qw = "восьмёрка";
                break;
            case 9:
                qw = "девятка";
                break;
            case 10:
                qw = "десятка";
                break;
            case 11:
                qw = "валет";
                break;
            case 12:
                qw = "дама";
                break;
            case 13:
                qw = "король";
                break;
            case 14:
                qw = "туз";
                break;
            default:
                qw = "6-14";

        }
        String Na="";
        switch (a) {
            case 1:
                Na = "пики";
                break;
            case 2:
                Na = "трефы";
                break;
            case 3:
                Na = "бубны";
                break;
            case 4:
                Na = "черви";
                break;
            default:
                Na = "1-14";
        }
        card.setText("Карта:"+Na+" "+qw);
    }
}



