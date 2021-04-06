package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class Controller {

    @FXML
    public void click(ActionEvent event) {
        System.out.println("CLICKED");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Cool application");
        alert.show();
    }
}
