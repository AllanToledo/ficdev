package com.allantoledo.server;


import com.allantoledo.dao.Connection;
import com.allantoledo.entities.Aluno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@SpringBootApplication
@RestController
@RequestMapping("/api/aluno")
public class AlunosAPI {


    @GetMapping
    public List<Aluno> listarAlunos() {
        EntityManager em = Connection.getInstance().getEntityManager();
        Query q = em.createQuery("select a from Aluno a", Aluno.class);
        return q.getResultList();
    }

    @PostMapping
    public String criarAluno(@RequestBody String nome) {
        EntityManager em = Connection.getInstance().getEntityManager();
        Aluno aluno = new Aluno(nome);
        em.getTransaction().begin();
        em.persist(aluno);
        em.getTransaction().commit();
        return "Aluno criado.\n";
    }

    @DeleteMapping("/{id}")
    public String removerAluno(@PathVariable int id) {
        return "Nao implementado.\n";
    }

    public static void main(String[] args) {
        SpringApplication.run(AlunosAPI.class, args);
    }
}
