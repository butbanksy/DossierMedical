package com.banksy.services;

import com.banksy.dao.IllnessDAO;
import com.banksy.models.Illness;

public class IllnessService {
    public static void addIllnessService(Illness illness) {
        IllnessDAO.addIllness(illness);

    }

}
