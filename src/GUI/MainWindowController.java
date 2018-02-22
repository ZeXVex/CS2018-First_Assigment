/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BE.Account;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author ZeXVex
 */
public class MainWindowController implements Initializable {

    @FXML
    private JFXPasswordField passeword;
    @FXML
    private JFXTextField username;
    @FXML
    private TextField test;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Account student1 = new Account("student", "12345", "nicolai", "work", "CS2017");
        Account teacher1 = new Account("teacher", "teacher", "Pasqual", "Caudrier", "SEN");
    }

    @FXML
    private void loginButton(ActionEvent event) throws IOException {
        //if (getClass(passeword = )) & (username.toString("student")); {
        Stage primaryStage = new Stage();
        primaryStage.initModality(Modality.WINDOW_MODAL);
        FXMLLoader fxLoader = new FXMLLoader(getClass().getResource("StidenrView.fxml"));

        Parent root = fxLoader.load();
        StudentViewController stc = fxLoader.getController();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
    }
}
