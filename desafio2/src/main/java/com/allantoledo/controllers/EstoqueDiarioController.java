package com.allantoledo.controllers;

//@author Allan Toledo

import com.allantoledo.model.EstoqueDiario;
import com.allantoledo.repositories.EstoqueDiarioRepository;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estoquediario")
public class EstoqueDiarioController {
    private EstoqueDiarioRepository estoqueDiarioRepository;

    public EstoqueDiarioController(EstoqueDiarioRepository estoqueDiarioRepository) {
        this.estoqueDiarioRepository = estoqueDiarioRepository;
    }
    
    @GetMapping
    public List<EstoqueDiario> listarTodosEstoquesDiario(){
        return estoqueDiarioRepository.findAll();
    }
    
    @GetMapping("/entregador/{id}")
    public List<EstoqueDiario> listarEstoquesDiariosPorEntregador(@PathVariable int id){
        return estoqueDiarioRepository.getEstoqueDiarioByEntregador(id);
    }
    
    @PostMapping
    public ResponseEntity<EstoqueDiario> cadastrarEstoqueDiario(@RequestBody EstoqueDiario estoqueDiario){
        EstoqueDiario salvo = estoqueDiarioRepository.save(estoqueDiario);
        return ResponseEntity.ok(salvo);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<EstoqueDiario> atualizarEstoqueDiario(@PathVariable int id, @RequestBody EstoqueDiario estoqueDiario){
        EstoqueDiario atualizar = estoqueDiarioRepository.findById(id).orElse(null);
        if(atualizar == null) return ResponseEntity.notFound().build();
        atualizar.setData(estoqueDiario.getData());
        atualizar.setEntregador(estoqueDiario.getEntregador());
        atualizar.setQtdeitens(estoqueDiario.getQtdeitens());
        estoqueDiarioRepository.save(atualizar);
        return ResponseEntity.ok(atualizar);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<EstoqueDiario> deletarEstoqueDiario(@PathVariable int id){
        EstoqueDiario deletado = estoqueDiarioRepository.findById(id).orElse(null);
        if(deletado == null) return ResponseEntity.notFound().build();
        estoqueDiarioRepository.delete(deletado);
        return ResponseEntity.ok(deletado);
    }
}
