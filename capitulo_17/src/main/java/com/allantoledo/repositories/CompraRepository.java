package com.allantoledo.repositories;

import com.allantoledo.entities.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
@EnableJpaRepositories
public interface CompraRepository extends JpaRepository<Compra, Long> {

    @Query(
        value = "SELECT * FROM compra c WHERE c.cliente_id = ?1",
        nativeQuery = true
    )
    List<Compra> getComprasByCliente(Long id);
}
