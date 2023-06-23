package com.allantoledo.controllers;

//@author Allan Toledo

import com.allantoledo.model.Entregador;
import com.allantoledo.repositories.EntregadorRepository;
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
@RequestMapping("/api/entregador")
public class EntregadorController {
    private EntregadorRepository entregadorRepository;

    public EntregadorController(EntregadorRepository entregadorRepository) {
        this.entregadorRepository = entregadorRepository;
    }

    @GetMapping
    public List<Entregador> listarTodosEntregadores(){
        return entregadorRepository.findAll();
    }
    
    @GetMapping("/{cnh}")
    public ResponseEntity<Entregador> pegarEntregadorPorCnh(@PathVariable String cnh){
        Entregador entregador = entregadorRepository.getEntregadorByCnh(cnh).orElse(null);
        if(entregador == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(entregador);
    }
    
    @PostMapping
    public ResponseEntity<Entregador> cadastrarEntregador(@RequestBody Entregador entregador){
        Entregador salvo = entregadorRepository.save(entregador);
        return ResponseEntity.ok(salvo);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Entregador> atualizarEntregador(@PathVariable int id, @RequestBody Entregador entregador){
        Entregador atualizar = entregadorRepository.findById(id).orElse(null);
        if(atualizar==null) return ResponseEntity.notFound().build();
        atualizar.setCnh(entregador.getCnh());
        atualizar.setData(entregador.getData());
        atualizar.setHora(entregador.getHora());
        atualizar.setNome(entregador.getNome());
        
        entregadorRepository.save(atualizar);
        return ResponseEntity.ok(atualizar);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Entregador> deletarEntregador(@PathVariable int id){
        Entregador deletado = entregadorRepository.findById(id).orElse(null);
        if(deletado == null) return ResponseEntity.notFound().build();
        entregadorRepository.delete(deletado);
        return ResponseEntity.ok(deletado);
    }
}
