package com.banksy.controllers;

import com.banksy.models.Patient;
import com.banksy.services.PatientService;
import com.banksy.validators.PatientValidator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/signup")
public class SignUpController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/views/ajout.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Patient patient = PatientValidator.addPatientValidator(req);
        if (patient != null) {
            PatientService.addPatient(patient);
            this.getServletContext().getRequestDispatcher("/WEB-INF/views/successful.jsp").forward(req, resp);
        }
        else {
            this.getServletContext().getRequestDispatcher("/WEB-INF/views/fail.jsp").forward(req, resp);
        }
    }
}
