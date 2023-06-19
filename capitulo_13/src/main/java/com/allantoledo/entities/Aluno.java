package com.allantoledo.entities;

//@author Allan Toledo

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Entity
@Table(name="aluno")
public class Aluno {
    @Getter
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int matricula;
    private String nome;
    @OneToMany(mappedBy="aluno", cascade=CascadeType.ALL)
    private List<Notas> notas;

    public Aluno(String nome) {
        this.nome = nome;
    }
    
}
