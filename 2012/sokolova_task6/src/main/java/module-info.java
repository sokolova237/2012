module ru.sokolova.sokolova_task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.sokolova.sokolova_task6 to javafx.fxml;
    exports ru.sokolova.sokolova_task6;
}