package com.allantoledo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


//@author Allan Toledo
@Data
@NoArgsConstructor
@Entity
@Table(name="turma")
public class Turma {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int codigo;
    private String curso;
    private String diaHorario;
    
    @OneToMany(mappedBy="turma", cascade=CascadeType.ALL)
    @JsonIgnore
    private List<Notas> notas;
    
}
