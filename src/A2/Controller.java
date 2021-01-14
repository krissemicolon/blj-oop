package A2;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    // Initialize
    @FXML
    private TextField widthField;
    @FXML
    private TextField heightField;
    @FXML
    private TextField resultField;

    @FXML
    private void calculate() {
        try {
            int width = Integer.parseInt(widthField.getText());
            int height = Integer.parseInt(heightField.getText());
            int result = width * height;

            resultField.setText(String.valueOf(result));
        }catch (Exception e) {
            throwRequireError();
        }
    }

    @FXML
    private void exit() {
        System.exit(0);
    }

    private void throwRequireError() {
        widthField.setPromptText("width is required!");
        heightField.setPromptText("height is required!");
    }

}
