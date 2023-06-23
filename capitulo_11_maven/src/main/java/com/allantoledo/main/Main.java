/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.allantoledo.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author ficdev
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("galeria");
        EntityManager em = factory.createEntityManager();
        
        ObraDeArte obra = new ObraDeArte();
        obra.setAutor("Menó");
        obra.setDataObra(parseData("12/10/2012"));
        obra.setDimensoes("12cm x 122cm");
        obra.setProcedencia("Aham");
        obra.setTecnica("Óleo");
        obra.setTipo("Pinto");
        obra.setTitulo("Uh");
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(obra);
        tx.commit();
        em.close();
        factory.close();
        
    }
    
    public static Calendar parseData(String data){
        try {
            Date date = new SimpleDateFormat("dd/mm/yyyy").parse(data);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
