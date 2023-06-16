package com.allantoledo.dao;

//@author Allan Toledo

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Connection {

    private static Connection instance;
    
    public static Connection getInstance(){
        if(instance == null) instance = new Connection();
        return instance;
    }
    
    private Connection(){
        factory = Persistence.createEntityManagerFactory("escolaPU");
        em = factory.createEntityManager();
    }
    
    private EntityManagerFactory factory;
    private EntityManager em;
    
    public void persist(Object o){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(o);
        tx.commit();
    }
    
    public void close(){
        factory.close();
        em.close();
        instance = null;
    }
    
}
