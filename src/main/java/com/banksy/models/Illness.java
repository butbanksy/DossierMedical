package com.banksy.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "maladies")
public class Illness {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int illnessID;
    @Column(name = "nom")
    private String illnessName;
    @ManyToMany
    @JoinTable(name = "JOIN_PATIENT_ILLNESS",
            joinColumns={@JoinColumn( name = "illnessID")},
            inverseJoinColumns = {@JoinColumn(name = "patientID")})

    private List<Patient> patients = new ArrayList<>();

    public String getIllnessName() {
        return illnessName;
    }

    public void setIllnessName(String illnessName) {
        this.illnessName = illnessName;
    }


    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public int getIllnessID() {
        return illnessID;
    }

    @Override
    public String toString() {
        return illnessID + ":" + illnessName;
    }
}

