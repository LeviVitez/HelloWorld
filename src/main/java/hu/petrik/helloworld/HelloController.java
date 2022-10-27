package hu.petrik.helloworld;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label koszontesSzoveg;
    @FXML
    private TextField nevMezo;

    @FXML
    protected void koszontes(ActionEvent actionEvent) {
        String nev=nevMezo.getText().trim();
        if (nev.isEmpty()){
            Alert felugroablak=new Alert(Alert.AlertType.WARNING);
            felugroablak.setContentText("Kérem adja meg a nevét");
            felugroablak.getButtonTypes().add(ButtonType.CLOSE);
            felugroablak.showAndWait();
            koszontesSzoveg.setText("");
        } else {
            koszontesSzoveg.setText("Hello "+nev);
        }
    }
}