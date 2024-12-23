package ru.sokolova.sokolova_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private TextField PT;

    @FXML
    private Label vL;

    @FXML
    void bt(ActionEvent event) {
        float P = Float.parseFloat(PT.getText().toString());
        if (P <= 0 || P >= 25) {
            vL.setText("0<P>25");
            return;

        }
        double d = 1000.0;
        double a = 1100.0;
        int m = 0;
        double t = d;
        while (t <= a) {
            t += t * (P / 100);
            m++;
        }
        vL.setText(String.format("Через %d месяцев вклад превысит 1100 рублей. Итоговая сумма: %.2f рублей.", m, a));
    }
}
