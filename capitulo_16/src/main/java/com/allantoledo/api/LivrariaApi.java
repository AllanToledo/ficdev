package com.allantoledo.api;

//@author Allan Toledo
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@SpringBootApplication
@RestController
@RequestMapping("/api/livros")
public class LivrariaApi {

    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Retorna uma lista de livros"),
        @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
        @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @GetMapping
    public List<Livro> listarTodosOsLivros() {
        EntityManager em = App.factory.createEntityManager();
        Query q = em.createQuery("select l from Livro l", Livro.class);
        List<Livro> livros = q.getResultList();
        return livros;
    }

    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Livro cadastrado com sucesso"),
        @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
        @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @PostMapping
    public String cadastrarLivro(@RequestBody Livro livro) {
        EntityManager em = App.factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(livro);
        em.getTransaction().commit();
        return "{\"message\": \"Sucesso\", \"id\": " + livro.getId() + "}";
    }

}
