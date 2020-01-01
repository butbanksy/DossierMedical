package com.banksy.dao;

import com.banksy.models.Patient;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

import static com.banksy.constants.DBConstants.entityManagerFactory;



public class PatientDAO {

    public static final EntityManagerFactory DOSSIERMEDICAL = Persistence.createEntityManagerFactory("dossiermedical");

    public static List<Patient> getAllPatients() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        String query = "select p from Patient p where p.patientID is not null";
        TypedQuery<Patient> typedQuery = entityManager.createQuery(query, Patient.class);
        try {
            for (Patient p : (typedQuery.getResultList())) {
                System.out.println(p);
            }
            return typedQuery.getResultList();
        } catch (NoResultException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public static void addPatient(Patient patient){
        EntityManager entityManager = DOSSIERMEDICAL.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(patient);
            entityTransaction.commit();
        } catch (Exception e) {
            if (entityTransaction != null) {
                entityTransaction.rollback()        ;
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
}
