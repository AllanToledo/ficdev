/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.allantoledo.app;

import com.allantoledo.controller.AlunoController;
import com.allantoledo.dao.Connection;
import com.allantoledo.model.AlunoModel;
import com.allantoledo.view.AlunoView;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author ficdev
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        listAll();
    }

    public static void create() {

        AlunoModel aluno = new AlunoModel();
        aluno.setNome("Carlos Maia");
        aluno.setIdade(10);
        aluno.setMatricula("12345678");
        
        Connection.getInstance().persist(aluno);
        
    }

    public static void update(String newMatricula) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("escolaPU");
        EntityManager em = factory.createEntityManager();
        Query q = em.createQuery("select a from AlunoModel a", AlunoModel.class);
        
        AlunoModel aluno = (AlunoModel) q.getSingleResult();
        //AlunoModel aluno = (AlunoModel) em.find(AlunoModel.class, 1);
        AlunoView alunoView = new AlunoView();
        AlunoController alunoController = new AlunoController(aluno, alunoView);
        alunoController.exibirDetalhesAluno();
        
        aluno.setMatricula(newMatricula);
        
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(aluno);
        tx.commit();
        em.close();
        factory.close();

        alunoController.exibirDetalhesAluno();

    }
    
     public static void listOne() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("escolaPU");
        EntityManager em = factory.createEntityManager();
        
        AlunoModel aluno = (AlunoModel) em.find(AlunoModel.class, 1);
        AlunoView alunoView = new AlunoView();
        AlunoController alunoController = new AlunoController(aluno, alunoView);
        alunoController.exibirDetalhesAluno();
    }


    
    
    public static void listAll() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("escolaPU");
        EntityManager em = factory.createEntityManager();
        Query q = em.createQuery("select a from AlunoModel a", AlunoModel.class);
        List<AlunoModel> alunos = q.getResultList();

        for (var aluno : alunos) {
            AlunoView alunoView = new AlunoView();
            AlunoController alunoController = new AlunoController(aluno, alunoView);
            alunoController.exibirDetalhesAluno();
        }
    }
}
