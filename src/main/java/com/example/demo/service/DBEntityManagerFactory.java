package com.example.demo.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DBEntityManagerFactory {
    static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("DEMO");

    private DBEntityManagerFactory() {
    }

    public static EntityManager createEntityManager() {
        return emfactory.createEntityManager();
    }

}
