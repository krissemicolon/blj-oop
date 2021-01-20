package A3;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Controller {

    // Initialize
    @FXML
    private RadioButton radioDays;
    @FXML
    private RadioButton radioHours;
    @FXML
    private TextField velocityField;
    @FXML
    private TextField resultField;

    @FXML
    private void checkDays() {
        radioDays.setSelected(radioDays.isSelected());
        radioHours.setSelected(false);
    }

    @FXML
    private void checkHours() {
        radioHours.setSelected(radioHours.isSelected());
        radioDays.setSelected(false);
    }

    @FXML
    private void calculate() {
        boolean inDays = radioDays.isSelected();
        boolean inHours = radioHours.isSelected();
        int velocity = Integer.parseInt(velocityField.getText());
        int distance = 384400;

        try {
            int i = Integer.parseInt(velocityField.getText());
        } catch(Exception e) {
            alert("Velocity Field is required!");
        }
        if(!inDays && !inHours) {
            alert("Choosing between days and hours is required!");
        }
        if(radioHours.isSelected()) {
            double result = distance / velocity;
            resultField.setText(String.valueOf(result));
        }
        if(radioDays.isSelected()) {
            double result = distance /velocity / 24;
            resultField.setText(String.valueOf(result));
        }

    }

    @FXML
    private void alert(String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert");
        alert.setHeaderText("Error");
        alert.setContentText(content);
        alert.showAndWait();
    }

}
