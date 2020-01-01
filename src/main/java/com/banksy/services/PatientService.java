package com.banksy.services;

import com.banksy.dao.PatientDAO;
import com.banksy.exceptions.PatientNotFoundException;
import com.banksy.models.Patient;

public class PatientService {

    public static Patient checkLogin(String login, String password) throws PatientNotFoundException {
        return PatientDAO.getAllPatients().stream()
                .filter(patient -> patient.getLogin().equals(login) && patient.getPassword().equals(password))
                .findFirst()
                .orElseThrow(() -> new PatientNotFoundException("La combinaison de login/mot de passe ne correspond à aucun utilisateur"));
    }

    public static void addPatientService(Patient patient) {
        PatientDAO.addPatient(patient);
    }

    public static void getPatientService(int patientID) {
        PatientDAO.getPatient(patientID);
    }
}
