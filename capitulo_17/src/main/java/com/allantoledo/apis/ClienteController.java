package com.allantoledo.apis;

import com.allantoledo.entities.Cliente;
import com.allantoledo.repositories.ClienteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    private ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List<Cliente> listarTodosClientes(){
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> listarClientePorId(@PathVariable Long id){
        Cliente cliente = clienteRepository.findById(id).orElse(null);
        if(cliente == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(cliente);
    }

    @PostMapping
    public ResponseEntity<Cliente> criarCliente(@RequestBody Cliente cliente){
        Cliente save = clienteRepository.save(cliente);
        return ResponseEntity.ok(save);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizarCliente(@PathVariable Long id, @RequestBody Cliente cliente){
        Cliente updated = clienteRepository.findById(id).orElse(null);
        if(updated == null) return ResponseEntity.notFound().build();
        updated.setNome(cliente.getNome());
        updated.setCpf(cliente.getCpf());
        Cliente save = clienteRepository.save(updated);
        return ResponseEntity.ok(save);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Cliente> removerCliente(@PathVariable Long id){
        Cliente deleted = clienteRepository.findById(id).orElse(null);
        if(deleted == null) return ResponseEntity.notFound().build();
        clienteRepository.delete(deleted);
        return ResponseEntity.ok(deleted);
    }
}
