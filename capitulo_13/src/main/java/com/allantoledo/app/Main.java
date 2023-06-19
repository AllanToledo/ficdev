package com.allantoledo.app;

//@author Allan Toledo

import com.allantoledo.entities.Aluno;
import com.allantoledo.entities.Notas;
import com.allantoledo.entities.Turma;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        update();
    }
    
    public static void create() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("escolaPU");
        EntityManager em = factory.createEntityManager();
        
        Aluno allan = new Aluno("Allan Toledo");
        Aluno carlos = new Aluno("Carlos Rafael");
        
        Notas notasAllan = new Notas();
        Notas notasCarlos = new Notas();
        
        Turma java = new Turma();
        java.setCurso("JAVA I");
        java.setDiaHorario("SEGUNDA 18:00");
        
        notasAllan.setAluno(allan);
        notasAllan.setTurma(java);
        
        notasCarlos.setAluno(carlos);
        notasCarlos.setTurma(java);
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        em.persist(java);
        em.persist(notasAllan);
        em.persist(allan);
        em.persist(notasCarlos);
        em.persist(carlos);
        
        tx.commit();
        em.close();
        factory.close();
    }
    
    public static void update() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("escolaPU");
        EntityManager em = factory.createEntityManager();
        
        Aluno aluno = em.find(Aluno.class, 1);
        aluno.getNotas().forEach((notas) -> {
            //if(!notas.getTurma().getCurso().equalsIgnoreCase("JAVA I")) return;
            notas.setPrimeiraNota(9);
            notas.setSegundaNota(8);
        });
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        em.merge(aluno);
        
        tx.commit();
        em.close();
        factory.close();
    }
}
