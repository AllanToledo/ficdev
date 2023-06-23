package com.allantoledo.apis;

import com.allantoledo.entities.Produto;
import com.allantoledo.repositories.ProdutoRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public List<Produto> listarTodasCategorias() {
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> listarCategoriaById(@PathVariable Long id) {
        Produto produto = produtoRepository.findById(id).orElse(null);
        if (produto != null) {
            return ResponseEntity.ok(produto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Produto> cadastrarCategoria(@RequestBody Produto produto) {
        produtoRepository.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produto);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Produto> alterarCategoria(@PathVariable Long id, 
            @RequestBody Produto novoProduto) {
        
        Produto produto = produtoRepository.findById(id).orElse(null);
        if (produto != null) {
            produto.setNome(novoProduto.getNome());
            produto.setPreco(novoProduto.getPreco());
            produtoRepository.save(produto);
            return ResponseEntity.ok(produto);
        } else {
            return ResponseEntity.notFound().build();
        }
        
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity< Void> deletarProduto(
            @PathVariable Long id) {
        
        Produto categoria = produtoRepository.findById(id).orElse(null);
        
        if (categoria != null) {
            produtoRepository.delete(categoria);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
        
    }
}
