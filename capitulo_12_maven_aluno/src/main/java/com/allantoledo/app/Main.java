/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.allantoledo.app;

import com.allantoledo.controller.AlunoController;
import com.allantoledo.model.AlunoModel;
import com.allantoledo.view.AlunoView;
import java.util.List;
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

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("escolaPU");
        EntityManager em = factory.createEntityManager();
        Query q = em.createQuery("select a from AlunoModel a", AlunoModel.class);
        List<AlunoModel> alunos = q.getResultList();
        for(var aluno: alunos){
            AlunoView alunoView = new AlunoView();
            AlunoController alunoController = new AlunoController(aluno, alunoView);
            alunoController.exibirDetalhesAluno();
        }
    }
}
