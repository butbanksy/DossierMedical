package com.banksy.dao;

import com.banksy.models.Illness;
import com.banksy.models.Patient;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class IllnessDAO {
    public static final EntityManagerFactory DOSSIERMEDICAL = Persistence.createEntityManagerFactory("dossiermedical");

    public static void addIllness(Illness illness){
        EntityManager entityManager = DOSSIERMEDICAL.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(illness);
            entityTransaction.commit();
        } catch (Exception e) {
            if (entityTransaction != null) {
                entityTransaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
}
