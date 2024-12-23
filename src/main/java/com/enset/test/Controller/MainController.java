package com.enset.test.Controller;

import com.enset.test.entities.Patient;
import com.enset.test.metier.ICabinetImpl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    ICabinetImpl iCabinet = new ICabinetImpl();
    @FXML
    private TextField cinInput;

    @FXML
    private TableColumn<?, ?> cinPatient;

    @FXML
    private DatePicker dateInput;

    @FXML
    private TableColumn<?, ?> datenaissPatiet;

    @FXML
    private TableView<?> departementTable;

    @FXML
    private TableView<?> departementTable1;

    @FXML
    private TextField emailInput;

    @FXML
    private TableColumn<?, ?> emailPatient;

    @FXML
    private TableColumn<?, ?> idDepartement;

    @FXML
    private TableColumn<?, ?> idDepartement1;

    @FXML
    private TextField idDepartementInput;

    @FXML
    private TextField idDepartementInput1;

    @FXML
    private TextField idInput;

    @FXML
    private TableColumn<?, ?> idPatient;

    @FXML
    private TableColumn<?, ?> nomDepartement;

    @FXML
    private TableColumn<?, ?> nomDepartement1;

    @FXML
    private TextField nomDepartementInput;

    @FXML
    private TextField nomDepartementInput1;

    @FXML
    private TextField nomInput;

    @FXML
    private TableColumn<?, ?> nomPatient;

    @FXML
    private TextField prenomInput;

    @FXML
    private TableColumn<?, ?> prenomPatient;

    @FXML
    private TextField searchPatientInput;

    @FXML
    private TableView<Patient> tablePatients;

    @FXML
    private TableColumn<?, ?> telePatient;

    @FXML
    private TextField telephoneInput;
    ObservableList<Patient> patients = FXCollections.observableArrayList(
            iCabinet.getAllPatient()
    );
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idPatient.setCellValueFactory(new PropertyValueFactory<>("id_patient"));
        nomPatient.setCellValueFactory(new PropertyValueFactory<>("nom"));
        prenomPatient.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        cinPatient.setCellValueFactory(new PropertyValueFactory<>("cin"));
        telePatient.setCellValueFactory(new PropertyValueFactory<>("telephone"));
        emailPatient.setCellValueFactory(new PropertyValueFactory<>("email"));
        datenaissPatiet.setCellValueFactory(new PropertyValueFactory<>("date_naissance"));

        tablePatients.setItems(patients);
    }
    @FXML
    void addDepartement(ActionEvent event) {

    }

    @FXML
    void addPatient(MouseEvent event) {
        LocalDate time = dateInput.getValue();
        java.sql.Date sqlDate = java.sql.Date.valueOf(time);
        Patient patient = new Patient(Integer.parseInt(idInput.getText()), nomInput.getText(),prenomInput.getText(), cinInput.getText(), telephoneInput.getText(), emailInput.getText(), sqlDate);
        iCabinet.savePatient(patient);
        patients.add(patient);
    }

    @FXML
    void affecterDepartement(ActionEvent event) {

    }

    @FXML
    void removeDepartement(ActionEvent event) {

    }

    @FXML
    void removePatient(MouseEvent event) {
        Patient selectedPatient = tablePatients.getSelectionModel().getSelectedItem();
        iCabinet.deletePatient(selectedPatient.getId_patient());
        patients.remove(selectedPatient);
    }

    @FXML
    void rowClicked(MouseEvent event) {

    }

    @FXML
    void rowDepartementClicked(MouseEvent event) {

    }

    @FXML
    void searchPatientByNom(ActionEvent event) {

    }

    @FXML
    void updateDepartement(ActionEvent event) {

    }

    @FXML
    void updateProf(ActionEvent event) {

    }
}
