package com.allantoledo.apis;

import com.allantoledo.entities.Compra;
import com.allantoledo.repositories.CompraRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compra")
public class CompraController {
    private CompraRepository compraRepository;

    public CompraController(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }

    @GetMapping("/cliente/{id}")
    public List<Compra> listarComprasPorCliente(@PathVariable Long id){
        return compraRepository.getComprasByCliente(id);
    }

    @PostMapping
    public ResponseEntity<Compra> cadastrarCompra(@RequestBody Compra compra){
        Compra save = compraRepository.save(compra);
        return ResponseEntity.ok(save);
    }
}
