package com.allantoledo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="aluno")
public class AlunoModel {

    @Id
    private String nome;
    private int idade;
    private String matricula;

    public AlunoModel(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }
    
}
