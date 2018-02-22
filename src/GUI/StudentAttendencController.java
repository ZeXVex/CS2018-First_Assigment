/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BE.Dates;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXListView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author ZeXVex
 */
public class StudentAttendencController implements Initializable {

    @FXML
    private JFXListView<Dates> lstAttendencs;
    @FXML
    private Label presentpers;
    @FXML
    private JFXComboBox<String> prensentorabsent;
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
        Dates d1 = new Dates(01, 01, 2018, "Pressent");
        Dates d2 = new Dates(02, 01, 2018, "Pressent");
        Dates d3 = new Dates(03, 01, 2018, "Pressent");
        Dates d4 = new Dates(04, 01, 2018, "Pressent");
        Dates d5 = new Dates(05, 01, 2018, "Pressent");
        Dates d6 = new Dates(06, 01, 2018, "Pressent");
        Dates d7 = new Dates(07, 01, 2018, "Pressent");
        Dates d8 = new Dates(8, 01, 2018, "Pressent");
        Dates d9 = new Dates(9, 01, 2018, "Pressent");
        Dates d10 = new Dates(10, 01, 2018, "Pressent");
        Dates d11 = new Dates(11, 01, 2018, "Pressent");
        Dates d12 = new Dates(12, 01, 2018, "Pressent");
        Dates d13 = new Dates(13, 01, 2018, "Pressent");
        Dates d14 = new Dates(14, 01, 2018, "Pressent");
        Dates d15 = new Dates(15, 01, 2018, "Pressent");
        Dates d16 = new Dates(16, 01, 2018, "Pressent");
        Dates d17 = new Dates(17, 01, 2018, "Pressent");
        Dates d18 = new Dates(18, 01, 2018, "Pressent");
        Dates d19 = new Dates(19, 01, 2018, "Pressent");
        Dates d20 = new Dates(20, 01, 2018, "Pressent");
        Dates d21 = new Dates(21, 01, 2018, "Pressent");
        Dates d22 = new Dates(22, 01, 2018, "Pressent");
        Dates d23 = new Dates(23, 01, 2018, "Pressent");
        Dates d24 = new Dates(24, 01, 2018, "Pressent");
        Dates d25 = new Dates(25, 01, 2018, "Pressent");
        Dates d26 = new Dates(26, 01, 2018, "Pressent");
        Dates d27 = new Dates(27, 01, 2018, "Pressent");
        Dates d28 = new Dates(28, 01, 2018, "Pressent");
        Dates d29 = new Dates(29, 01, 2018, "Pressent");
        Dates d30 = new Dates(30, 01, 2018, "Pressent");
        Dates d31 = new Dates(31, 01, 2018, "Pressent");
        lstAttendencs.getItems().add(d1);
        lstAttendencs.getItems().add(d2);
        lstAttendencs.getItems().add(d3);
        lstAttendencs.getItems().add(d4);
        lstAttendencs.getItems().add(d5);
        lstAttendencs.getItems().add(d6);
        lstAttendencs.getItems().add(d7);
        lstAttendencs.getItems().add(d8);
        lstAttendencs.getItems().add(d9);
        lstAttendencs.getItems().add(d10);
        lstAttendencs.getItems().add(d11);
        lstAttendencs.getItems().add(d12);
        lstAttendencs.getItems().add(d13);
        lstAttendencs.getItems().add(d14);
        lstAttendencs.getItems().add(d15);
        lstAttendencs.getItems().add(d16);
        lstAttendencs.getItems().add(d17);
        lstAttendencs.getItems().add(d18);
        lstAttendencs.getItems().add(d19);
        lstAttendencs.getItems().add(d20);
        lstAttendencs.getItems().add(d21);
        lstAttendencs.getItems().add(d22);
        lstAttendencs.getItems().add(d23);
        lstAttendencs.getItems().add(d24);
        lstAttendencs.getItems().add(d25);
        lstAttendencs.getItems().add(d26);
        lstAttendencs.getItems().add(d27);
        lstAttendencs.getItems().add(d28);
        lstAttendencs.getItems().add(d29);
        lstAttendencs.getItems().add(d30);
        lstAttendencs.getItems().add(d31);
        prensentorabsent.getItems().setAll("Pressent", "Absent");
    }

    @FXML
    private void combobox(MouseEvent event) {
        lstAttendencs.getSelectionModel().getSelectedItem().setPressent(prensentorabsent.getPromptText());
        System.out.println(lstAttendencs.getSelectionModel().getSelectedItem().getPressent());
    }

}
