package com.banksy.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table (name = "patients")
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false, updatable = false)
    private int patientID;
    @Column (name = "prénom", nullable = false)
    private String firstName;
    @Column (name = "nom", nullable = false)
    private String lastName;
    @Column (name ="age", nullable = false)
    private String age;
    @Column (nullable = false)
    private String login;
    @Column(nullable = false)
    private String password;
    @ManyToMany
    private Collection<Illness> illnesses = new ArrayList<>();
    private boolean admin = false;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Collection<Illness> getIllnesses() {
        return illnesses;
    }

    public void setIllnesses(Collection<Illness> illnesses) {
        this.illnesses = illnesses;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return login + ":" + password;
    }
}
