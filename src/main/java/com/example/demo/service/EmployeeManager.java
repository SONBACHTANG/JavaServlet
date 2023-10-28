package com.example.demo.service;

import entities.Employees;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class EmployeeManager {
    private static final EntityManager entityManager = DBEntityManagerFactory.createEntityManager();

    public static boolean create(Employees user) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static List<Employees> getAll() {
        String jpql = "SELECT e FROM Employees e";
        TypedQuery<Employees> query = entityManager.createQuery(jpql, Employees.class);
        return query.getResultList();
    }

    /**
     * find by ID
     *
     * @param id
     */
    public static Employees get(int id) {
        Employees user = entityManager.find(Employees.class, id);
        entityManager.close();
        return user;
    }

    public static void update() {

    }

    public static boolean delete(int id) {
        try {
            entityManager.getTransaction().begin();
            Employees user = entityManager.find(Employees.class, id);
            if(user ==null) return false;
            entityManager.remove(user);
            System.out.println("da log form");
            entityManager.getTransaction().commit();
            entityManager.close();

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
