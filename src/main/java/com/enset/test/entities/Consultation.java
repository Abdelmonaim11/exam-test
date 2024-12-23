package com.enset.test.entities;

import java.util.Date;

public class Consultation {
    private int id_consultation;
    private Date date_consultation;

    public Consultation(int id_consultation, Date date_consultation) {
        this.id_consultation = id_consultation;
        this.date_consultation = date_consultation;
    }

    public Consultation() {
    }

    public int getId_consultation() {
        return id_consultation;
    }

    public void setId_consultation(int id_consultation) {
        this.id_consultation = id_consultation;
    }

    public Date getDate_consultation() {
        return date_consultation;
    }

    public void setDate_consultation(Date date_consultation) {
        this.date_consultation = date_consultation;
    }
}
