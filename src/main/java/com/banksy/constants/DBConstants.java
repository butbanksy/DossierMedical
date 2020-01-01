package com.banksy.constants;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBConstants {

    public static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dossiermedical");
    public static final String FIRST_NAME = "firstName";
    public static final String LAST_NAME = "lastName";
    public static final String AGE = "age";
    public static final String LOGIN = "login";
    public static final String PASSWORD = "password";
    public static final String ILLNESS_NAME = "illessName";
}

