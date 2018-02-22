/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BE.Account;
import GUI.MainWindowController;
import com.jfoenix.controls.JFXListView;
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
public class TeacherViewController implements Initializable {

    MainWindowController mwc = new MainWindowController();

    @FXML
    private Label fname;
    @FXML
    private Label lname;
    @FXML
    private JFXListView<Account> lstStudents;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Account student1 = new Account("", "", "nicolai", "work", "CS2017");
        lstStudents.getItems().add(student1);
    }

    @FXML
    private void btnstudentatt(ActionEvent event) throws IOException {
        Stage primaryStage = new Stage();
        primaryStage.initModality(Modality.WINDOW_MODAL);
        FXMLLoader fxLoader = new FXMLLoader(getClass().getResource("TeachersStudentView.fxml"));

        Parent root = fxLoader.load();
        TeachersStudentViewController stc = fxLoader.getController();

        Account selectedAccount
                = lstStudents.getSelectionModel().getSelectedItem();
        stc.setAccount(selectedAccount);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.showAndWait();
    }

    public void setLabels(String name, String lName) {
        fname.setText(name);
        lname.setText(lName);
    }
}
