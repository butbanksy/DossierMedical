package com.banksy.validators;

import com.banksy.models.Patient;

import javax.servlet.http.HttpServletRequest;

import static com.banksy.constants.DBConstants.*;

public class PatientValidator {


    public static Patient addPatientValidator(HttpServletRequest req) {
        try {
            Patient patient = new Patient();
            patient.setFirstName(req.getParameter(FIRST_NAME));
            patient.setLastName(req.getParameter(LAST_NAME));
            patient.setAge(req.getParameter(AGE));
            patient.setLogin(req.getParameter(LOGIN));
            patient.setPassword(req.getParameter(PASSWORD));
            return patient;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Patient loginPatientValidator(HttpServletRequest req) {

        try {
            Patient patient = new Patient();
            patient.setLogin(req.getParameter(LOGIN));
            patient.setPassword(req.getParameter(PASSWORD));
            return patient;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}

