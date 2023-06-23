package com.allantoledo.repositories;

import com.allantoledo.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
