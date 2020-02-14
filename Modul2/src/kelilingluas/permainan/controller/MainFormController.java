/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelilingluas.permainan.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sun.security.provider.certpath.AdjacencyList;

/**
 * FXML Controller class
 *
 * @author Nathanael Liman (  1872014 )
 */
public class MainFormController implements Initializable {

    @FXML
    private Button submit;
    @FXML
    private Button square;
    @FXML
    private Button ball;
    @FXML
    private Button Tube;
    @FXML
    private TextField lenght;
    @FXML
    private TextField widht;
    @FXML
    private TextField radius;
    @FXML
    private TextField height;

    private int type = 0;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void submitAction(ActionEvent event) {
        String output = "";
        int hasil = 0;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Message");
        alert.setHeaderText("Message");
        if (type == 1) {
            output += "Area: ";
            hasil = Integer.parseInt(widht.getText()) * Integer.parseInt(
                    height.getText());
            output += hasil + ", Circumference: ";
            hasil = 2 * (Integer.parseInt(widht.getText()) + Integer.
                    parseInt(height.getText()));
            output += hasil;
        } else if (type == 2) {
            output += "Surface Area: ";
            hasil = (int) (4 * 3.14 * Math.pow(Integer.parseInt(radius.
                    getText()), 2));
            output += hasil + ", Volume: ";
            hasil = (int) ((4 / 3) * 3.14 * (4 * 3.14 * Math.pow(Integer.
                    parseInt(radius.getText()), 3)));
            output += hasil;
        } else if (type == 3) {
            output += "Surface Area: ";
            hasil = (int) (2 * 3.14 * Integer.parseInt(radius.getText())
                    * (Integer.parseInt(radius.getText()) + Integer.parseInt(
                    height.getText())));
            output += hasil + ", Volume: ";
            hasil = (int) (3.14 * Math.pow(Integer.parseInt(radius.
                    getText()), 2) * Integer.parseInt(height.getText()));
            output += hasil;
        }
        alert.setContentText(output);
        alert.showAndWait();
    }

    @FXML
    private void squareAction(ActionEvent event) {
        widht.setDisable(false);
        height.setDisable(false);
        radius.setDisable(true);
        lenght.setDisable(true);
        type = 1;
    }

    @FXML
    private void ballAction(ActionEvent event) {
        widht.setDisable(true);
        height.setDisable(true);
        radius.setDisable(false);
        lenght.setDisable(true);
        type = 2;
    }

    @FXML
    private void tubeAction(ActionEvent event) {
        widht.setDisable(true);
        height.setDisable(false);
        radius.setDisable(false);
        lenght.setDisable(true);
        type = 3;
    }

}
