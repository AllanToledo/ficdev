package com.allantoledo.repositories;

//@author Allan Toledo

import com.allantoledo.model.EstoqueDiario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface EstoqueDiarioRepository extends JpaRepository<EstoqueDiario, Integer>{
    
    @Query(
        value = "SELECT * FROM estoque_diario ed WHERE ed.entregador_fk = ?1",
        nativeQuery = true
    )
    List<EstoqueDiario> getEstoqueDiarioByEntregador(Integer id);

}
