package com.banksy.controllers;


import com.banksy.dao.IllnessDAO;
import com.banksy.models.Illness;
import com.banksy.services.IllnessService;
import com.banksy.validators.IllnessValidator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/illness")
public class IllnessController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("list", IllnessDAO.getAllIllnesses());
        this.getServletContext().getRequestDispatcher("/WEB-INF/views/add_illness.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Illness illness = IllnessValidator.addIllnessValidator(req);

        if (illness != null) {
            IllnessService.addIllnessService(illness);
            req.setAttribute("list", IllnessDAO.getAllIllnesses());
            this.getServletContext().getRequestDispatcher("/WEB-INF/views/add_illness.jsp").forward(req, resp);
        }
    }
}
