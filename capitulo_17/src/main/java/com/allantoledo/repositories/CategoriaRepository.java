package com.allantoledo.repositories;

//@author Allan Toledo
import com.allantoledo.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
