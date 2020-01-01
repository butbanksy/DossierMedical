package com.banksy.controllers;

import com.banksy.dao.PatientDAO;
import com.banksy.models.Patient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/search")
public class PatientLookupController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Patient patient = PatientDAO.getPatient(Integer.parseInt(req.getParameter("patientID")));
        if (patient != null) {
            req.setAttribute("myPatient", patient);
            this.getServletContext().getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, resp);
        }
        else {
            System.out.println("User not found");
        }
    }
}
