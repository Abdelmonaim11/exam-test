package com.enset.test.dao;

import com.enset.test.entities.Medecin;
import com.enset.test.entities.Patient;
import com.enset.test.metier.ICabinetImpl;

import java.util.Date;

public class TestICabinetImpl {
    public static void main(String[] args) {
        ICabinetImpl iCabinet = new ICabinetImpl();
        // iCabinet.saveMedecin(new Medecin(1, "Ahdoud", "Monaim", "monaim11@gmail.com", "0723987453"));
        //iCabinet.savePatient(new Patient("Ettahiri", "PF235452", "Ali", "0731423234", "ali.ett1@gmail.com", new Date(), 1);
        Patient patient = new Patient(1,"Ghazoui", "PA3535511", "Amine", "0634456461342", "amine11@gmail.com", java.sql.Date.valueOf("2010-09-24"));
        iCabinet.savePatient(patient);
    }
}
