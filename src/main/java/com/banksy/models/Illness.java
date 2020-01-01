package com.banksy.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "maladies")
public class Illness {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int illnessID;
    @Column(name = "nom")
    private String illnessName;
    @ManyToMany
    private Collection<Patient> patients = new ArrayList<>();

    public String getIllnessName() {
        return illnessName;
    }

    public void setIllnessName(String illnessName) {
        this.illnessName = illnessName;
    }

 public Collection<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Collection<Patient> patients) {
        this.patients = patients;
    }
}

