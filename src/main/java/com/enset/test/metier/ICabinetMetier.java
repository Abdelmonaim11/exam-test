package com.enset.test.metier;

import com.enset.test.entities.Consultation;
import com.enset.test.entities.Medecin;
import com.enset.test.entities.Patient;

import java.util.List;

public interface ICabinetMetier {
    //Patient Methods
     List<Patient> getAllPatient();
     List<Patient> searchByKeyword(String keyword);
    void savePatient(Patient patient);
    void deletePatient(int id);
    List<Consultation> consultationByPatient(int id_patient);
    //Medecin Methods
    List<Medecin> getAllMedecin();
    void saveMedecin(Medecin medecin);
    void deleteMedecin(int id);
    List<Consultation> consultationByMedecin(int id_medecin);
    //Consultation Methods
    void saveConsultation(Consultation consultation, int id_patient, int id_medecin);
    List<Consultation> getAllConsultation();
    void deleteConsultation(int id_consl);
}
