package com.banksy.controllers;

import com.banksy.exceptions.PatientNotFoundException;
import com.banksy.models.Patient;
import com.banksy.services.PatientService;
import com.banksy.validators.PatientValidator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/views/authentification.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Patient patient = PatientValidator.loginPatientValidator(req);
        if (patient != null) {
            try {
                patient = PatientService.checkLogin(patient.getLogin(), patient.getPassword());
                if (patient.isAdmin()){
                    this.getServletContext().getRequestDispatcher("/WEB-INF/views/admin.jsp").forward(req, resp);
                }
                else{
                    req.setAttribute("myPatient", patient);
                    this.getServletContext().getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, resp);
                }
            } catch (PatientNotFoundException e) {
                e.printStackTrace();
                this.getServletContext().getRequestDispatcher("/WEB-INF/views/ajout.jsp").forward(req, resp);
            }
        }
    }
}
