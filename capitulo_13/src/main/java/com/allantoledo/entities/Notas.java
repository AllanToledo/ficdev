package com.allantoledo.entities;

//@author Allan Toledo

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name="notas")
public class Notas {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter
    private int codigo;
    @Getter
    private double primeiraNota = 0;
    @Getter
    private double segundaNota = 0;
    @Getter
    private double mediaFinal = 0;
    @ManyToOne
    @JoinColumn(name="matricula_aluno", nullable=true)
    @Getter
    @Setter
    @JsonIgnore
    private Aluno aluno;
    @ManyToOne
    @JoinColumn(name="codigo_turma", nullable=true)
    @Getter
    @Setter
    private Turma turma;
    
    
    public void setPrimeiraNota(double nota){
        this.primeiraNota = nota;
        updateMedia();
    }
    
    public void setSegundaNota(double nota){
        this.segundaNota = nota;
        updateMedia();
    }
    
    private void updateMedia(){
        this.mediaFinal = (primeiraNota + segundaNota) / 2.0;
    }
    
    public double getMedia() {
        return this.mediaFinal;
    }
    
}
