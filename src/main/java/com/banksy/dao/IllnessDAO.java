package com.banksy.dao;

import com.banksy.models.Illness;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

import static com.banksy.constants.DBConstants.entityManagerFactory;


public class IllnessDAO {
    public static final EntityManagerFactory DOSSIERMEDICAL = Persistence.createEntityManagerFactory("dossiermedical");

    public static List<Illness> getAllIllnesses() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        String query = "select i from Illness i where i.illnessID is not null";
        TypedQuery<Illness> typedQuery = entityManager.createQuery(query, Illness.class);
        try {
            for (Illness i : (typedQuery.getResultList())) {
                System.out.println(i);
            }
            return typedQuery.getResultList();
        } catch (NoResultException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

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
