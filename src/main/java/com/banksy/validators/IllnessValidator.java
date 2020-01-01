package com.banksy.validators;

import com.banksy.models.Illness;

import javax.servlet.http.HttpServletRequest;

import static com.banksy.constants.DBConstants.*;

public class IllnessValidator {
    public static Illness addIllnessValidator(HttpServletRequest request) {
        try {
            Illness illness = new Illness();
            illness.setIllnessName(request.getParameter("illnessName"));
            System.out.println(illness.getIllnessName());
            return illness;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
