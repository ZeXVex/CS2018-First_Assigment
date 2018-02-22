/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ZeXVex
 */
public class StudentViewController implements Initializable {

    @FXML
    private Label fname;
    @FXML
    private Label lname;
    @FXML
    private Label classes;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fname.setText("nicolai");
        lname.setText("work");
        classes.setText("cs2017B");
    }

    @FXML
    private void btbattend(ActionEvent event) {
    }

    @FXML
    private void btbcheckattends(ActionEvent event) throws IOException {
        Stage primaryStage = new Stage();
        primaryStage.initModality(Modality.WINDOW_MODAL);
        FXMLLoader fxLoader = new FXMLLoader(getClass().getResource("StudentAttendencView.fxml"));

        Parent root = fxLoader.load();
        StudentViewController stc = fxLoader.getController();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
    }
}
