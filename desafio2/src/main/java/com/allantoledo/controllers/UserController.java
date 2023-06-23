package com.allantoledo.controllers;

//@author Allan Toledo
import com.allantoledo.model.User;
import com.allantoledo.repositories.UserRepository;
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
@RequestMapping("/api/user")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> listarTodosUsuarios() {
        return userRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<User> cadastrarUsuario(@RequestBody User user) {
        User salvo = userRepository.save(user);
        return ResponseEntity.ok(salvo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> atualizarUsuario(@PathVariable int id, @RequestBody User user) {
        User atualizar = userRepository.findById(id).orElse(null);
        if(atualizar == null) return ResponseEntity.notFound().build();
        atualizar.setName(user.getName());
        atualizar.setPassword(user.getPassword());
        atualizar.setUuid(user.getUuid());
        userRepository.save(atualizar);
        return ResponseEntity.ok(atualizar);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<User> deletarUsuario(@PathVariable int id){
        User deletado = userRepository.findById(id).orElse(null);
        if(deletado == null) return ResponseEntity.notFound().build();
        userRepository.delete(deletado);
        return ResponseEntity.ok(deletado);
    }
}
