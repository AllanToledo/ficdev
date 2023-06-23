package com.allantoledo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allantoledo.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
//@author Allan Toledo
@Repository
@EnableJpaRepositories
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
