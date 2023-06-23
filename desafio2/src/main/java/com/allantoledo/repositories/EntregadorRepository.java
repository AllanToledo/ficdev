package com.allantoledo.repositories;

//@author Allan Toledo

import com.allantoledo.model.Entregador;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface EntregadorRepository extends JpaRepository<Entregador, Integer>{

    @Query(
        value = "SELECT * FROM entregador e WHERE e.cnh = ?1 LIMIT 1",
        nativeQuery = true
    )
    Optional<Entregador> getEntregadorByCnh(String cnh);
}
