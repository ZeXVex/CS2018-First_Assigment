/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.jfoenix.controls.JFXListView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author ZeXVex
 */
public class StudentAttendencController implements Initializable {

    @FXML
    private JFXListView<?> lstAttendencs;
    @FXML
    private Label presentpers;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void opengraph(ActionEvent event) {
    }

    @FXML
    private void prensentorabsent(ActionEvent event) {
    }
    
}
