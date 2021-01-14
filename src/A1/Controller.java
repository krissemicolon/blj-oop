package A1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class Controller {
    @FXML
    private void onButtonClick() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Info");
        alert.setHeaderText("Hello World");
        alert.setContentText("Erste Aufgabe von Kris Huber");
        alert.showAndWait();

    }


}
